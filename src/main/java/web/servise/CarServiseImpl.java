package web.servise;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
@Service

public class CarServiseImpl implements CarService {
    private List<Car> cars;

    public CarServiseImpl(){
        cars = new ArrayList<>();
        for (int i =0; i<5; i++) {
            cars.add(new Car(i,"Producer_"+i, "Model_"+i));
        }
    }

    @Override
    public void setCar(Car car) {

    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        int limit = Math.min(count, 5);
        return cars.stream().limit(limit).toList();
    }
}
