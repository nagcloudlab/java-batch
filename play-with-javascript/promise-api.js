//----------------------------------------------------------------
// Trainer
//----------------------------------------------------------------

const trainer = {
  getTopic: function () {
    const promise = new Promise((resolve, reject) => {
      setTimeout(() => {
        let topic = 1;
        // console.log("trainer : resolving the promise...");
        // resolve(topic); // push
        console.log("trainer : rejecting the promise...");
        reject("oops");
      }, 3000);
    });
    return promise;
  },
};

//----------------------------------------------------------------
// Employee
//----------------------------------------------------------------

const employee = {
  doLearn: function () {
    console.log("employee : learning..");
    console.log("employee : requesting a topic on trainer");
    const promise = trainer.getTopic();
    console.log("employee : got promise , defer actions to future");
    promise
      .then((topic) => {
        return topic * 1000;
      })
      .then((enrichedTopic) => {
        console.log("employee : learning topic : " + enrichedTopic);
      })
      .catch((error) => {
        console.log("employee : error : " + error);
      });
    console.log("employee : cont.. if any other work exist");
  },
};

employee.doLearn();
