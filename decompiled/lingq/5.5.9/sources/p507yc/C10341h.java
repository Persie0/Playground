package p507yc;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.media.AbstractC0140a;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p072dd.C5151d;

/* JADX INFO: renamed from: yc.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10341h {

    /* JADX INFO: renamed from: c */
    public float f52041c;

    /* JADX INFO: renamed from: e */
    public WeakReference<b> f52043e;

    /* JADX INFO: renamed from: f */
    public C5151d f52044f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f52039a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final a f52040b = new a();

    /* JADX INFO: renamed from: d */
    public boolean f52042d = true;

    /* JADX INFO: renamed from: yc.h$a */
    public class a extends AbstractC0140a {
        public a() {
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: X */
        public final void mo586X(int i10) {
            C10341h c10341h = C10341h.this;
            c10341h.f52042d = true;
            b bVar = c10341h.f52043e.get();
            if (bVar != null) {
                bVar.mo8572a();
            }
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: Y */
        public final void mo587Y(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            C10341h c10341h = C10341h.this;
            c10341h.f52042d = true;
            b bVar = c10341h.f52043e.get();
            if (bVar != null) {
                bVar.mo8572a();
            }
        }
    }

    /* JADX INFO: renamed from: yc.h$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo8572a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C10341h(b bVar) {
        this.f52043e = new WeakReference<>(null);
        this.f52043e = new WeakReference<>(bVar);
    }

    /* JADX INFO: renamed from: a */
    public final float m19352a(String str) {
        if (!this.f52042d) {
            return this.f52041c;
        }
        float fMeasureText = str == null ? 0.0f : this.f52039a.measureText((CharSequence) str, 0, str.length());
        this.f52041c = fMeasureText;
        this.f52042d = false;
        return fMeasureText;
    }

    /* JADX INFO: renamed from: b */
    public final void m19353b(C5151d c5151d, Context context) {
        if (this.f52044f != c5151d) {
            this.f52044f = c5151d;
            if (c5151d != null) {
                TextPaint textPaint = this.f52039a;
                a aVar = this.f52040b;
                c5151d.m10935f(context, textPaint, aVar);
                b bVar = this.f52043e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                c5151d.m10934e(context, textPaint, aVar);
                this.f52042d = true;
            }
            b bVar2 = this.f52043e.get();
            if (bVar2 != null) {
                bVar2.mo8572a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
