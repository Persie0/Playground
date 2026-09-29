package p072dd;

import android.graphics.Typeface;
import android.support.v4.media.AbstractC0140a;
import com.google.android.material.internal.C3040a;
import p507yc.C10335b;

/* JADX INFO: renamed from: dd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5148a extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public final Typeface f33124a;

    /* JADX INFO: renamed from: b */
    public final a f33125b;

    /* JADX INFO: renamed from: c */
    public boolean f33126c;

    /* JADX INFO: renamed from: dd.a$a */
    public interface a {
    }

    public C5148a(C10335b c10335b, Typeface typeface) {
        this.f33124a = typeface;
        this.f33125b = c10335b;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: X */
    public final void mo586X(int i10) {
        if (!this.f33126c) {
            C3040a c3040a = ((C10335b) this.f33125b).f52022a;
            if (c3040a.m8804j(this.f33124a)) {
                c3040a.m8802h(false);
            }
        }
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: Y */
    public final void mo587Y(Typeface typeface, boolean z10) {
        if (!this.f33126c) {
            C3040a c3040a = ((C10335b) this.f33125b).f52022a;
            if (c3040a.m8804j(typeface)) {
                c3040a.m8802h(false);
            }
        }
    }
}
