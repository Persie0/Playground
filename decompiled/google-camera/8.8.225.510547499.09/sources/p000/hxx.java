package p000;

import android.text.format.DateUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.bottombar.C0100R;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hxx extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hxy f29857a;

    public hxx(hxy hxyVar) {
        this.f29857a = hxyVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f29857a.f29860b.setContentDescription(view.getResources().getString(C0100R.string.accessibility_elapsed_recording_time_description, DateUtils.formatElapsedTime(Duration.ofMillis(this.f29857a.f29862d).getSeconds())));
        this.f29857a.f29861c.setContentDescription(view.getResources().getString(C0100R.string.accessibility_video_output_length_description, DateUtils.formatElapsedTime(Duration.ofMillis(this.f29857a.f29863e).getSeconds())));
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
