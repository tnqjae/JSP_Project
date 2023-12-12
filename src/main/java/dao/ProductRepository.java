package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {

    private ArrayList<Product> listOfProducts = new ArrayList<Product>();
    private static ProductRepository instance = new ProductRepository();

    public static ProductRepository getInstance(){
        return instance;
    }
    public ProductRepository() {
        Product phone = new Product("N-R-4090", "NVIDIA Geforce RTX 4090 Founders Edition D6X 24GB", 3988000);
        phone.setDescription("4nm / base clock: 2230MHz / boost clock: 2520MHz / CUDA: 16384개 / PCIe4.0x16 / GDDR6X(DDR6X) / Output : HDMI2.1 , DP1.4 / 부가기능: 8K 지원 , 4K 지원 , HDR 지원 , HDCP 2.3 / Power: 최대 450W / Power port: 16핀(12VHPWR) x1 / Up to 850W / 가로(길이): 304mm / 두께: 61mm / 백플레이트");
        phone.setCategory("Graphic Card(GPU)");
        phone.setManufacturer("Nvida");
        phone.setUnitsInStock(1000);
        phone.setCondition("New");
        phone.setFilename("4090.jpeg");

        Product notebook = new Product("R-750x", "AMD Ryzen Gen5 7800X3D ", 583000);
        notebook.setDescription("AMD(소켓AM5) / 5세대(Zen4) / 5nm / 8코어 / 16쓰레드 / 기본 클럭: 4.2GHz / 최대 클럭: 5.0GHz / L2 캐시: 8MB / L3 캐시: 96MB / TDP: 120W / PCIe5.0 / 메모리 규격: DDR5 / 5200MHz / 내장그래픽: 탑재 / AMD 라데온 그래픽 / 기술 지원: Ryzen Master, 3D V캐시 / 쿨러: 미포함 / 시네벤치R23(싱글): 1820 / 시네벤치R23(멀티): 18219 / 출시가: 449달러(VAT별도)");
        notebook.setCategory("CPU");
        notebook.setManufacturer("AMD");
        notebook.setUnitsInStock(750);
        notebook.setCondition("New");
        notebook.setFilename("r7800x3d.jpeg");

        Product tablet = new Product("Micron-d5-162", "마이크론 Crucial DDR5-5600 CL46 PRO 패키지 대원씨티에스 (16GB)", 70000);
        tablet.setDescription("데스크탑용 / DDR5 / 5600MHz (PC5-44800) / 램타이밍: CL46-45-45 / 1.10V / 램개수: 1개 / XMP3.0 / EXPO / 온다이ECC / 히트싱크: 방열판 / 방열판 색상: 블랙");
        tablet.setCategory("RAM");
        tablet.setManufacturer("Micron");
        tablet.setUnitsInStock(1000);
        tablet.setCondition("New");
        tablet.setFilename("micron16gbpro.png");

        listOfProducts.add(phone);
        listOfProducts.add(notebook);
        listOfProducts.add(tablet);
    }


    public ArrayList<Product> getAllProducts() {
        return listOfProducts;
    }

    public Product getProductById(String productId) {
        Product productById = null;

        for (int i = 0; i < listOfProducts.size(); i++) {
            Product product = listOfProducts.get(i);
            if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
                productById = product;
                break;
            }
        }
        return productById;
    }

    public void addProduct(Product product) {
        listOfProducts.add(product);
    }

}
