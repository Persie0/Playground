package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ru0 implements li7 {
    /* JADX INFO: renamed from: a */
    public abstract boolean mo20819a(char c);

    @Override // p000.li7
    public final boolean apply(Object obj) {
        return mo20819a(((Character) obj).charValue());
    }
}
