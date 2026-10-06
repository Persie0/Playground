package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adv implements aea {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f177a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f178b;

    public adv(aie aieVar, int i, byte[] bArr) {
        this.f178b = i;
        this.f177a = aieVar;
    }

    public adv(String str, int i) {
        this.f178b = i;
        this.f177a = str;
    }

    @Override // p000.aea
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo309a(Object obj) {
        switch (this.f178b) {
            case 0:
                kym kymVar = (kym) obj;
                synchronized (adw.f181c) {
                    ArrayList arrayList = (ArrayList) adw.f182d.get(this.f177a);
                    if (arrayList == null) {
                        return;
                    }
                    adw.f182d.remove(this.f177a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((aea) arrayList.get(i)).mo309a(kymVar);
                    }
                    return;
                }
            default:
                kym kymVar2 = (kym) obj;
                if (kymVar2 == null) {
                    kymVar2 = new kym(-3, (byte[]) null);
                }
                ((aie) this.f177a).m770o(kymVar2);
                return;
        }
    }
}
