package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbh {

    /* JADX INFO: renamed from: a */
    public boolean f35524a;

    /* JADX INFO: renamed from: b */
    public final Object f35525b;

    public kbh() {
        this.f35525b = new Handler(Looper.getMainLooper(), new btc());
    }

    public kbh(CheckedTextView checkedTextView) {
        this.f35525b = checkedTextView;
    }

    public kbh(String str) {
        this.f35525b = str;
        this.f35524a = false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m13933a() {
        return this.f35524a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m13934b() {
        if (!this.f35524a) {
            System.loadLibrary((String) this.f35525b);
            this.f35524a = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m13935c(bsz bszVar, boolean z) {
        if (!this.f35524a && !z) {
            this.f35524a = true;
            bszVar.mo3018e();
            this.f35524a = false;
            return;
        }
        ((Handler) this.f35525b).obtainMessage(1, bszVar).sendToTarget();
    }

    /* JADX INFO: renamed from: d */
    public final void m13936d() {
        ((CheckedTextView) this.f35525b).getCheckMarkDrawable();
    }

    /* JADX INFO: renamed from: e */
    public final void m13937e(AttributeSet attributeSet) {
        int iM1616s;
        int iM1616s2;
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(((CheckedTextView) this.f35525b).getContext(), attributeSet, C0193fr.f23268l, C0100R.attr.checkedTextViewStyle, 0);
        Object obj = this.f35525b;
        afn.m536c((View) obj, ((CheckedTextView) obj).getContext(), C0193fr.f23268l, attributeSet, (TypedArray) ambientDelegateM1568D.f1686b, C0100R.attr.checkedTextViewStyle, 0);
        try {
            if (ambientDelegateM1568D.m1575A(1) && (iM1616s2 = ambientDelegateM1568D.m1616s(1, 0)) != 0) {
                try {
                    Object obj2 = this.f35525b;
                    ((CheckedTextView) obj2).setCheckMarkDrawable(C0194fs.m8752a(((CheckedTextView) obj2).getContext(), iM1616s2));
                } catch (Resources.NotFoundException e) {
                    if (ambientDelegateM1568D.m1575A(0)) {
                        Object obj3 = this.f35525b;
                        ((CheckedTextView) obj3).setCheckMarkDrawable(C0194fs.m8752a(((CheckedTextView) obj3).getContext(), iM1616s));
                    }
                }
            } else if (ambientDelegateM1568D.m1575A(0) && (iM1616s = ambientDelegateM1568D.m1616s(0, 0)) != 0) {
                Object obj4 = this.f35525b;
                ((CheckedTextView) obj4).setCheckMarkDrawable(C0194fs.m8752a(((CheckedTextView) obj4).getContext(), iM1616s));
            }
            if (ambientDelegateM1568D.m1575A(2)) {
                ((CheckedTextView) this.f35525b).setCheckMarkTintList(ambientDelegateM1568D.m1617t(2));
            }
            if (ambientDelegateM1568D.m1575A(3)) {
                ((CheckedTextView) this.f35525b).setCheckMarkTintMode(C0768kh.m14230a(ambientDelegateM1568D.m1613p(3, -1), null));
            }
        } finally {
            ambientDelegateM1568D.m1622y();
        }
    }

    public kbh(Handler handler, AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f35525b = new iyz(handler, ambientController, null, null, null, null, null);
    }
}
