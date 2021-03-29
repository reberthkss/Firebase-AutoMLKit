package comdialogy.studios.testml.MLKit.ObjectDetection

import com.google.mlkit.vision.objects.ObjectDetection
import com.google.mlkit.vision.objects.ObjectDetector
import com.google.mlkit.vision.objects.defaults.ObjectDetectorOptions

class StreamObjectDetectionManager {
    private val objectDetectorOptions = ObjectDetectorOptions
        .Builder()
        .setDetectorMode(ObjectDetectorOptions.STREAM_MODE)
        .enableClassification()
        .enableMultipleObjects()
        .build()
    private val objectDetector: ObjectDetector = ObjectDetection.getClient(objectDetectorOptions)

}