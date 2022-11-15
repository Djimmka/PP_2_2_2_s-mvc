package web.servise;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;

public interface CarService {
    public void setCar(Car car);
    public List<Car> getCars();

    public List<Car> getCars(int count);


}
