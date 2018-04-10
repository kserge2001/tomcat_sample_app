package com.sample;

/**
 * Created by sk1067 on 4/10/2018.
 */

import com.sample.model.DrinkSelector;
import com.sample.model.DrinkType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



@WebServlet(
        name = "selectdrinkservlet",
        urlPatterns = "/SelectDrinks"
)
public class SelectDrinkServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String drinkType = req.getParameter("Type");

        DrinkSelector drinkSelect = new DrinkSelector();
        DrinkType l = DrinkType.valueOf(drinkType);

        List drinkBrands = drinkSelect.getAvailableBrands(l);

        req.setAttribute("brands", drinkBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
