package backAgil.example.back.controllers;

import backAgil.example.back.models.OrderDetail;
import backAgil.example.back.models.OrderInput;
import backAgil.example.back.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/order")
public class OrderDetailController {
   @Autowired
    private OrderDetailService orderDetailService;


    //@PreAuthorize("hasRole('User')")
    @PostMapping("/placeOrder")
    public OrderDetail placeOrder(@RequestBody OrderInput orderInput) {
        return orderDetailService.placeOrder(orderInput);
    }

    @GetMapping
    public ResponseEntity<List<OrderDetail>> getAllOrders() {
        List<OrderDetail> orders = orderDetailService.getAllOrdersWithProducts();
        return ResponseEntity.ok(orders);
    }
}

