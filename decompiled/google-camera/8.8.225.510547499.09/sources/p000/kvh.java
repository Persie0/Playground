package p000;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvh implements kvn, kvl {

    /* JADX INFO: renamed from: a */
    private final mrm f37348a;

    /* JADX INFO: renamed from: b */
    private final String f37349b;

    /* JADX INFO: renamed from: c */
    private final String f37350c;

    /* JADX INFO: renamed from: d */
    private final dsx f37351d;

    /* JADX INFO: renamed from: e */
    private final lpe f37352e;

    public kvh(lpe lpeVar, dsx dsxVar, mrm mrmVar, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37352e = lpeVar;
        this.f37351d = dsxVar;
        this.f37348a = mrmVar;
        this.f37349b = str;
        this.f37350c = str2;
    }

    /* JADX INFO: renamed from: c */
    private static void m14932c(List list, String str, int i, String str2) {
        if (mro.m16832b(str2)) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", str);
        contentValues.put("data1", str2);
        contentValues.put("data2", Integer.valueOf(i));
        list.add(contentValues);
    }

    /* JADX INFO: renamed from: d */
    private static void m14933d(Intent intent, String str, String str2) {
        lku.m15614I(!mro.m16832b(str), "Must have valid field name");
        if (mro.m16832b(str2)) {
            return;
        }
        intent.putExtra(str, str2);
    }

    @Override // p000.kvl
    /* JADX INFO: renamed from: a */
    public final Intent mo14930a() {
        if (!this.f37348a.mo16813g() || ((kxd) this.f37348a.mo16809c()).f37620a.isEmpty()) {
            lvd.f39383a.m16090d(this, "No contact object present in ResultInfo. Defaulting to sending limited information with Intent. This should not happen", new Object[0]);
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra("name", this.f37349b);
            return intent;
        }
        Intent intent2 = new Intent("android.intent.action.INSERT");
        intent2.setType("vnd.android.cursor.dir/contact");
        kxd kxdVar = (kxd) this.f37348a.mo16809c();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = kxdVar.f37621b.iterator();
        while (it.hasNext()) {
            m14932c(arrayList, "vnd.android.cursor.item/email_v2", 2, (String) it.next());
        }
        Iterator it2 = kxdVar.f37622c.iterator();
        while (it2.hasNext()) {
            m14932c(arrayList, "vnd.android.cursor.item/phone_v2", 3, (String) it2.next());
        }
        if (!kxdVar.f37624e.isEmpty()) {
            m14932c(arrayList, "vnd.android.cursor.item/website", 5, kxdVar.f37624e);
        }
        if (!kxdVar.f37623d.isEmpty()) {
            m14932c(arrayList, "vnd.android.cursor.item/postal-address_v2", 2, kxdVar.f37623d);
        }
        if (!kxdVar.f37626g.isEmpty()) {
            m14932c(arrayList, "vnd.android.cursor.item/organization", 1, kxdVar.f37626g);
        }
        if (!arrayList.isEmpty()) {
            intent2.putParcelableArrayListExtra("data", arrayList);
        }
        m14933d(intent2, "name", ((kxd) this.f37348a.mo16809c()).f37620a);
        m14933d(intent2, "notes", ((kxd) this.f37348a.mo16809c()).f37625f);
        return intent2;
    }

    @Override // p000.kvn
    /* JADX INFO: renamed from: b */
    public final void mo14931b() {
        Intent intentMo14930a = mo14930a();
        this.f37351d.m6699n(String.format(this.f37350c, this.f37349b));
        this.f37352e.m15812k(intentMo14930a);
    }
}
