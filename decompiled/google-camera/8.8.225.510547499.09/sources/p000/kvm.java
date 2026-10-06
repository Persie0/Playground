package p000;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvm implements kvn, kvl {

    /* JADX INFO: renamed from: a */
    private final String f37362a;

    /* JADX INFO: renamed from: b */
    private final mrm f37363b;

    /* JADX INFO: renamed from: c */
    private final lpe f37364c;

    public kvm(lpe lpeVar, String str, mrm mrmVar, byte[] bArr, byte[] bArr2) {
        this.f37364c = lpeVar;
        this.f37362a = str;
        this.f37363b = mrmVar;
    }

    @Override // p000.kvl
    /* JADX INFO: renamed from: a */
    public final Intent mo14930a() {
        String strConcat;
        if (!this.f37363b.mo16813g() || ((kxe) this.f37363b.mo16809c()).equals(kxe.f37627c)) {
            strConcat = "geo:0,0?q=".concat(String.valueOf(this.f37362a));
        } else {
            kxe kxeVar = (kxe) this.f37363b.mo16809c();
            double d = kxeVar.f37629a;
            double d2 = kxeVar.f37630b;
            strConcat = "geo:" + d + "," + d2 + "?q=" + d + "," + d2;
        }
        return new Intent("android.intent.action.VIEW", Uri.parse(strConcat));
    }

    @Override // p000.kvn
    /* JADX INFO: renamed from: b */
    public final void mo14931b() {
        this.f37364c.m15812k(mo14930a());
    }
}
