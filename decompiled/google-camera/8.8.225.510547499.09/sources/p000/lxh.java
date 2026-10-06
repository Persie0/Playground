package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lxh extends apn {
    public lxh(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apn
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1805b(arf arfVar, Object obj) {
        lxm lxmVar = (lxm) obj;
        arfVar.mo1845e(1, lxmVar.f39511a);
        arfVar.mo1845e(2, lyy.m16191h(lxmVar.f39512b));
        String strM16185b = lyy.m16185b(lxmVar.f39513c);
        if (strM16185b == null) {
            arfVar.mo1846f(3);
        } else {
            arfVar.mo1847g(3, strM16185b);
        }
        String str = lxmVar.f39514d;
        if (str == null) {
            arfVar.mo1846f(4);
        } else {
            arfVar.mo1847g(4, str);
        }
        byte[] bArrM16198o = lyy.m16198o(lxmVar.f39515e);
        if (bArrM16198o == null) {
            arfVar.mo1846f(5);
        } else {
            arfVar.mo1843c(5, bArrM16198o);
        }
        arfVar.mo1845e(6, lxmVar.f39516f);
        String str2 = lxmVar.f39517g;
        if (str2 == null) {
            arfVar.mo1846f(7);
        } else {
            arfVar.mo1847g(7, str2);
        }
        String str3 = lxmVar.f39518h;
        if (str3 == null) {
            arfVar.mo1846f(8);
        } else {
            arfVar.mo1847g(8, str3);
        }
        String str4 = lxmVar.f39519i;
        if (str4 == null) {
            arfVar.mo1846f(9);
        } else {
            arfVar.mo1847g(9, str4);
        }
        arfVar.mo1845e(10, lxmVar.f39521k);
        lxv lxvVar = lxmVar.f39520j;
        Long lM16204u = lyy.m16204u(lxvVar.f39537a);
        if (lM16204u == null) {
            arfVar.mo1846f(11);
        } else {
            arfVar.mo1845e(11, lM16204u.longValue());
        }
        Long lM16204u2 = lyy.m16204u(lxvVar.f39538b);
        if (lM16204u2 == null) {
            arfVar.mo1846f(12);
        } else {
            arfVar.mo1845e(12, lM16204u2.longValue());
        }
        Long lM16204u3 = lyy.m16204u(lxvVar.f39539c);
        if (lM16204u3 == null) {
            arfVar.mo1846f(13);
        } else {
            arfVar.mo1845e(13, lM16204u3.longValue());
        }
        arfVar.mo1845e(14, lyy.m16184a(lxvVar.f39540d));
        arfVar.mo1845e(15, lyy.m16206w(lxvVar.f39541e));
        arfVar.mo1844d(16, lxvVar.f39542f);
        arfVar.mo1845e(17, lxmVar.f39521k);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "UPDATE OR ABORT `AnnotachmentEntity` SET `resourceOnDeviceId` = ?,`isAttachment` = ?,`id` = ?,`contentType` = ?,`provenance` = ?,`onDeviceSize` = ?,`uploadTransferHandle` = ?,`blobstoreId` = ?,`contentHash` = ?,`onDeviceId` = ?,`status_addedToAirlockEpochTimestamp` = ?,`status_uploadToF250RequestedEpochTimestamp` = ?,`status_uploadToF250CompletedEpochTimestamp` = ?,`status_airlockFileState` = ?,`status_uploadState` = ?,`status_uploadProgressPercent` = ? WHERE `onDeviceId` = ?";
    }
}
