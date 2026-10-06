package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.camera.p014ui.preference.KeyListenerPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class idz implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TextView f30540a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Button f30541b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Button f30542c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ KeyListenerPreference f30543d;

    public idz(KeyListenerPreference keyListenerPreference, TextView textView, Button button, Button button2) {
        this.f30543d = keyListenerPreference;
        this.f30540a = textView;
        this.f30541b = button;
        this.f30542c = button2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        String strM4411a = KeyListenerPreference.m4411a(keyEvent);
        if (!strM4411a.isEmpty()) {
            switch (i) {
                case 4:
                case 22:
                case 24:
                case 25:
                    this.f30540a.setText("Error: Key is not supported by Pixel Camera");
                    this.f30541b.setEnabled(false);
                    break;
                default:
                    this.f30540a.setText("New Key Bind: " + strM4411a + " (Key Code: " + i + ")");
                    if (Integer.parseInt(this.f30543d.f7105a) != i) {
                        this.f30543d.f7105a = Integer.toString(i);
                        this.f30543d.f7106b = strM4411a;
                    }
                    this.f30541b.setEnabled(true);
                    break;
            }
        } else {
            this.f30540a.setText("Error: Key is not supported by Pixel Camera");
            this.f30541b.setEnabled(false);
        }
        this.f30542c.setVisibility(0);
        this.f30540a.sendAccessibilityEvent(32768);
        return true;
    }
}
