import "./App.css";
import {
  Form,
  Button,
  Container,
  Row,
  InputGroup,
  FormControl,
  Col,
  Card,
} from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import NumberFormat from "react-number-format";

function App() {
  return (
    <Container fluid="md">
      <Row className="justify-content-center text-center ">
        <Col md="6">
          <Card border="primary" style={{ width: "100%" }}>
            <Form className="d-flex flex-column justify-content-center w-100 p-3 ">
              <h3>Welcome!</h3>
              <InputGroup className="mb-3 d-flex justify-content-center w-100">
                <InputGroup.Prepend>
                  <InputGroup.Text>Account Number</InputGroup.Text>
                </InputGroup.Prepend>
                <NumberFormat
                  className="form-control"
                  format="########-########-########"
                  mask="_"
                />
              </InputGroup>
              <div className="w-25">
                <InputGroup className="mb-3">
                  <InputGroup.Prepend>
                    <InputGroup.Text>PIN</InputGroup.Text>
                  </InputGroup.Prepend>
                  <FormControl type="password"></FormControl>
                </InputGroup>
              </div>
              <Button
                className="mx-auto"
                variant="success"
                type="submit"
                value="Submit"
                size="lg"
                text="Login"
              >
                Login
              </Button>{" "}
            </Form>
          </Card>
        </Col>
      </Row>
    </Container>
  );
}

export default App;
