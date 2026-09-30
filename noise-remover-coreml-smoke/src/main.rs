#[cfg(any(target_os = "ios", target_os = "macos"))]
use ort::ep::{self, ExecutionProvider};

fn main() {
    #[cfg(any(target_os = "ios", target_os = "macos"))]
    {
        let coreml = ep::CoreML::default()
            .with_static_input_shapes(true)
            .with_model_format(ep::coreml::ModelFormat::MLProgram)
            .with_compute_units(ep::coreml::ComputeUnits::All);
        let _ = coreml.clone().build().error_on_failure();
        let _ = coreml.is_available();
        println!("CoreML MLProgram/static-shape provider API compiled");
    }
}
