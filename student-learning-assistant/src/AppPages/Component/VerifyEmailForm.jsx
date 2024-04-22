import {Container, Form, FormLabel} from "react-bootstrap";

const VerifyEmailForm = () =>{
    return(
        <Container>
            <div className={'verify-form'}>
                    <Form className={'code-form'}>
                        <legend><FormLabel>Verify Your Email</FormLabel></legend>
                        <Form.Text className={'text'}>
                            Please check your email for a 6 digit verification code.
                        </Form.Text>

                        <Form.Group className={'code-input'}>
                            <Form.Label className={'label'}>CODE</Form.Label>
                            <div className={'input-control'}>
                                <Form.Control maxLength={6} type="text"/>
                            </div>
                        </Form.Group>
                        <legend>
                            <button className={'reg-btn resend'} >Resend</button>
                        </legend>
                    </Form>
            </div>
        </Container>
    );
}

export default VerifyEmailForm;