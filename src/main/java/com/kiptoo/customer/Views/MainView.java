package com.kiptoo.customer.Views;

import com.kiptoo.customer.entities.Customer;
import com.kiptoo.customer.repo.CustomerRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class MainView  extends VerticalLayout {
   private final CustomerRepository repo;
   final Grid<Customer> grid;

   public MainView(CustomerRepository repo){
       this.repo = repo;
       this.grid = new Grid<>(Customer.class);
       add(grid);
       listCustomers();
   }

   private void listCustomers(){
       grid.setItems(repo.findAll());
   }
}
