package p000;

import android.content.ContentValues;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krp {

    /* JADX INFO: renamed from: a */
    public static final krp f37069a = m14774b().m15368i();

    /* JADX INFO: renamed from: b */
    private final ContentValues f37070b;

    public krp(ContentValues contentValues) {
        this.f37070b = contentValues;
    }

    /* JADX INFO: renamed from: b */
    public static lhz m14774b() {
        return new lhz(new ContentValues());
    }

    /* JADX INFO: renamed from: c */
    public static lhz m14775c(krp krpVar) {
        return new lhz(new ContentValues(krpVar.f37070b));
    }

    /* JADX INFO: renamed from: a */
    final ContentValues m14776a() {
        return new ContentValues(this.f37070b);
    }
}
