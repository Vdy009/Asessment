package Controller;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.domain.Order;
import com.exam.dto.OrderShipDTO;

import Service.CalenderService;

@RestController
@RequestMapping("findStoreAvailability")
public class CalenderController {
	
	
	@Autowired
	private CalenderService calenderservice;
	
	 @GetMapping
	 public ResponseEntity  requestDate(@RequestBody  requestDate reqDTO) throws ExecutionException, InterruptedException {

	        CompletableFuture<Order> order = orderService.getOrder(shipDTO.getOrderId());
	 }
}
