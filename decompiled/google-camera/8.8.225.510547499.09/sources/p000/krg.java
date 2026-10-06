package p000;

import android.content.ContentValues;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krg implements kro {

    /* JADX INFO: renamed from: a */
    public final kbo f37034a;

    /* JADX INFO: renamed from: b */
    private final lme f37035b;

    public krg(lme lmeVar, kbo kboVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37035b = lmeVar;
        this.f37034a = kboVar.mo6314a("MediaFS-Q");
    }

    @Override // p000.kro
    /* JADX INFO: renamed from: a */
    public final krl mo14748a(krt krtVar, krj krjVar) {
        if (!krtVar.f37085a.m14772b()) {
            return new krv(this.f37035b, kry.m14788l(krtVar, krjVar, this.f37034a), this.f37034a, null, null, null);
        }
        lme lmeVar = this.f37035b;
        lku.m15669w(krtVar.m14786d());
        ContentValues contentValues = new ContentValues();
        contentValues.put(krjVar.f37055e, String.format(Locale.ROOT, "%s.%s", krtVar.f37087c, krtVar.f37088d));
        contentValues.put(krjVar.f37056f, krtVar.f37089e);
        contentValues.put(krjVar.f37059i, String.format(Locale.ROOT, "%s/%s", krtVar.f37085a.m14771a(krjVar.f37051a).getName(), krtVar.f37086b));
        if (kxk.m15012e(krtVar.f37089e)) {
            contentValues.put(krjVar.f37060j, Integer.valueOf(krjVar.f37061k));
        } else if (kxk.m15013f(krtVar.f37089e)) {
            contentValues.put(krjVar.f37060j, Integer.valueOf(krjVar.f37062l));
        }
        contentValues.put(krjVar.f37057g, Integer.valueOf(krjVar.f37058h));
        return new kru(lmeVar, new krw(krtVar, krjVar.f37051a.getContentResolver(), contentValues, krjVar), this.f37034a, null, null, null);
    }

    @Override // p000.kro
    /* JADX INFO: renamed from: b */
    public final krn mo14749b(krj krjVar) {
        return new krf(this, krjVar);
    }
}
