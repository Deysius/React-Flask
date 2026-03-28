from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello, world' 

@app.route('/api/users')
def get_users():
    return{
        'users':['Alice','Bob','Josue']
    }
    
@app.route('/api/fruits')
def get_fruits():
    return{
        'users':['Fresa','Coco']
    }
if __name__ == '__main__':
    app.run(debug=True)

