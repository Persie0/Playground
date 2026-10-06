package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opj implements opa {

    /* JADX INFO: renamed from: a */
    public final CharSequence f46384a;

    /* JADX INFO: renamed from: b */
    public final int f46385b;

    /* JADX INFO: renamed from: c */
    public final onm f46386c;

    public opj(CharSequence charSequence, int i, onm onmVar) {
        this.f46384a = charSequence;
        this.f46385b = i;
        this.f46386c = onmVar;
    }

    @Override // p000.opa
    /* JADX INFO: renamed from: a */
    public final Iterator mo18817a() {
        return new opi(this);
    }
}
