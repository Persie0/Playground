package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nfj implements Appendable {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Appendable f42183b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f42184c = ":";

    /* JADX INFO: renamed from: a */
    int f42182a = 2;

    public nfj(Appendable appendable) {
        this.f42183b = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        if (this.f42182a == 0) {
            this.f42183b.append(this.f42184c);
            this.f42182a = 2;
        }
        this.f42183b.append(c);
        this.f42182a--;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
