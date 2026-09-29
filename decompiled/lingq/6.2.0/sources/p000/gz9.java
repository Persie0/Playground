package p000;

import com.lingq.core.domain.model.theme.ReaderFont;

/* JADX INFO: loaded from: classes3.dex */
public final class gz9 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zi3 f41573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFont f41574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f41575c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f41576d;

    public gz9(zi3 zi3Var, ReaderFont readerFont, boolean z, boolean z2) {
        this.f41573a = zi3Var;
        this.f41574b = readerFont;
        this.f41575c = z;
        this.f41576d = z2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        this.f41573a.invoke(this.f41574b, Boolean.valueOf(this.f41575c || this.f41576d));
        return xfa.f68157a;
    }
}
