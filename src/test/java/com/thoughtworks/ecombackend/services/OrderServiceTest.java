package com.thoughtworks.ecombackend.services;

import com.thoughtworks.ecombackend.dto.OrderDto;
import com.thoughtworks.ecombackend.models.Order;
import com.thoughtworks.ecombackend.repositories.OrderRepository;
import com.thoughtworks.ecombackend.repositories.ProductRepository;
import com.thoughtworks.ecombackend.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @Mock
    private OrderRepository orderRepository;
    @Mock
    private UserRepository userRepository;
    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private OrderService orderService;

    @Test
    public void testFindAll() {
        // mock the orderRepository.findAll() method to return list of 2 orders
        when(orderRepository.findAll()).thenReturn(Arrays.asList(new Order(), new Order()));
        List<OrderDto> all = orderService.findAll();
        // assert that the size of the list returned by the service is 2
        assert (all.size() == 2);
    }

}
