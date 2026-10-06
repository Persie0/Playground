package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bsu implements Appendable {

    /* JADX INFO: renamed from: a */
    private final Appendable f4383a;

    /* JADX INFO: renamed from: b */
    private boolean f4384b = true;

    public bsu(Appendable appendable) {
        this.f4383a = appendable;
    }

    /* JADX INFO: renamed from: a */
    private static final CharSequence m3020a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        if (this.f4384b) {
            this.f4384b = false;
            this.f4383a.append("  ");
        }
        this.f4384b = c == '\n';
        this.f4383a.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        CharSequence charSequenceM3020a = m3020a(charSequence);
        append(charSequenceM3020a, 0, charSequenceM3020a.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        boolean z = false;
        if (this.f4384b) {
            this.f4384b = false;
            this.f4383a.append("  ");
        }
        CharSequence charSequenceM3020a = m3020a(charSequence);
        if (charSequenceM3020a.length() > 0 && charSequenceM3020a.charAt(i2 - 1) == '\n') {
            z = true;
        }
        this.f4384b = z;
        this.f4383a.append(charSequenceM3020a, i, i2);
        return this;
    }
}
