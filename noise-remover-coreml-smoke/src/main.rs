#[cfg(any(target_os = "ios", target_os = "macos"))]
use ort::ep::ExecutionProvider;
#[cfg(any(target_os = "ios", target_os = "macos"))]
use ort::execution_providers::CoreMLExecutionProvider;

fn main() {
    #[cfg(any(target_os = "ios", target_os = "macos"))]
    {
        let _ = CoreMLExecutionProvider::default().build();
        let _ = CoreMLExecutionProvider::default().is_available();
        println!("CoreML execution provider API compiled");
    }
}
