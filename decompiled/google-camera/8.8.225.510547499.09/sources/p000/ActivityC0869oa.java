package p000;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;

/* JADX INFO: renamed from: oa */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ActivityC0869oa extends Activity {

    /* JADX INFO: renamed from: a */
    private ComponentName f45114a;

    /* JADX INFO: renamed from: b */
    private int f45115b;

    /* JADX INFO: renamed from: c */
    private int[] f45116c;

    /* JADX INFO: renamed from: a */
    private final void m18336a() {
        ComponentName componentName = this.f45114a;
        int i = this.f45115b;
        int[] iArr = this.f45116c;
        Intent intent = new Intent("com.google.android.clockwork.home.complications.ACTION_CHOOSE_PROVIDER");
        intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", componentName);
        intent.putExtra("android.support.wearable.complications.EXTRA_COMPLICATION_ID", i);
        intent.putExtra("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES", iArr);
        startActivityForResult(intent, 1);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m18337b() {
        return aat.m170b(this, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA_PRIVILEGED") == 0 || aat.m170b(this, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA") == 0;
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme.Translucent.NoTitleBar);
        super.onCreate(bundle);
        Intent intent = getIntent();
        switch (intent.getAction()) {
            case "android.support.wearable.complications.ACTION_START_PROVIDER_CHOOSER":
                this.f45114a = (ComponentName) intent.getParcelableExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME");
                this.f45115b = intent.getIntExtra("android.support.wearable.complications.EXTRA_COMPLICATION_ID", 0);
                this.f45116c = intent.getIntArrayExtra("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES");
                if (m18337b()) {
                    m18336a();
                    return;
                } else {
                    aat.m51a(this, new String[]{"com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA"}, 1);
                    return;
                }
            case "android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY":
                this.f45114a = (ComponentName) intent.getParcelableExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME");
                if (m18337b()) {
                    finish();
                    return;
                } else {
                    aat.m51a(this, new String[]{"com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA"}, 2);
                    return;
                }
            default:
                throw new IllegalStateException("Unrecognised intent action.");
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] != 0) {
            finish();
            return;
        }
        if (i == 1) {
            m18336a();
        } else {
            finish();
        }
        ComponentName componentName = this.f45114a;
        Intent intent = new Intent("android.support.wearable.complications.ACTION_REQUEST_UPDATE_ALL_ACTIVE");
        intent.setPackage("com.google.android.wearable.app");
        intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT", componentName);
        intent.putExtra("android.support.wearable.complications.EXTRA_PENDING_INTENT", PendingIntent.getActivity(this, 0, new Intent(qQLA.bBrKnMGW), 67108864));
        sendBroadcast(intent);
    }
}
