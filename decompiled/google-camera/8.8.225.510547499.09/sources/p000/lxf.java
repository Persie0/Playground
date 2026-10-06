package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lxf extends apo {
    public lxf(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        lzb lzbVar = (lzb) obj;
        String str = lzbVar.f39591a;
        if (str == null) {
            arfVar.mo1846f(1);
        } else {
            arfVar.mo1847g(1, str);
        }
        String str2 = lzbVar.f39592b;
        if (str2 == null) {
            arfVar.mo1846f(2);
        } else {
            arfVar.mo1847g(2, str2);
        }
        arfVar.mo1847g(3, lyy.m16203t(lzbVar.f39593c));
        Long lM16204u = lyy.m16204u(lzbVar.f39594d);
        if (lM16204u == null) {
            arfVar.mo1846f(4);
        } else {
            arfVar.mo1845e(4, lM16204u.longValue());
        }
        Long lM16190g = lyy.m16190g(lzbVar.f39595e);
        if (lM16190g == null) {
            arfVar.mo1846f(5);
        } else {
            arfVar.mo1845e(5, lM16190g.longValue());
        }
        arfVar.mo1845e(6, lzbVar.f39596f);
        String str3 = lzbVar.f39597g;
        if (str3 == null) {
            arfVar.mo1846f(7);
        } else {
            arfVar.mo1847g(7, str3);
        }
        String str4 = lzbVar.f39598h;
        if (str4 == null) {
            arfVar.mo1846f(8);
        } else {
            arfVar.mo1847g(8, str4);
        }
        String strM16208y = lyy.m16208y(lzbVar.f39613w);
        if (strM16208y == null) {
            arfVar.mo1846f(9);
        } else {
            arfVar.mo1847g(9, strM16208y);
        }
        Long lM16190g2 = lyy.m16190g(lzbVar.f39599i);
        if (lM16190g2 == null) {
            arfVar.mo1846f(10);
        } else {
            arfVar.mo1845e(10, lM16190g2.longValue());
        }
        Long lM16190g3 = lyy.m16190g(lzbVar.f39600j);
        if (lM16190g3 == null) {
            arfVar.mo1846f(11);
        } else {
            arfVar.mo1845e(11, lM16190g3.longValue());
        }
        Long lM16190g4 = lyy.m16190g(lzbVar.f39601k);
        if (lM16190g4 == null) {
            arfVar.mo1846f(12);
        } else {
            arfVar.mo1845e(12, lM16190g4.longValue());
        }
        byte[] bArrM16207x = lyy.m16207x(lzbVar.f39602l);
        if (bArrM16207x == null) {
            arfVar.mo1846f(13);
        } else {
            arfVar.mo1843c(13, bArrM16207x);
        }
        arfVar.mo1845e(14, lzbVar.f39603m ? 1L : 0L);
        arfVar.mo1847g(15, lyy.m16192i(lzbVar.f39604n));
        String str5 = lzbVar.f39605o;
        if (str5 == null) {
            arfVar.mo1846f(16);
        } else {
            arfVar.mo1847g(16, str5);
        }
        String str6 = lzbVar.f39606p;
        if (str6 == null) {
            arfVar.mo1846f(17);
        } else {
            arfVar.mo1847g(17, str6);
        }
        byte[] bArrM16199p = lyy.m16199p(lzbVar.f39607q);
        if (bArrM16199p == null) {
            arfVar.mo1846f(18);
        } else {
            arfVar.mo1843c(18, bArrM16199p);
        }
        byte[] bArrM16198o = lyy.m16198o(lzbVar.f39608r);
        if (bArrM16198o == null) {
            arfVar.mo1846f(19);
        } else {
            arfVar.mo1843c(19, bArrM16198o);
        }
        byte[] bArrM16193j = lyy.m16193j(lzbVar.f39609s);
        if (bArrM16193j == null) {
            arfVar.mo1846f(20);
        } else {
            arfVar.mo1843c(20, bArrM16193j);
        }
        arfVar.mo1845e(21, lzbVar.f39611u);
        lxv lxvVar = lzbVar.f39610t;
        Long lM16204u2 = lyy.m16204u(lxvVar.f39537a);
        if (lM16204u2 == null) {
            arfVar.mo1846f(22);
        } else {
            arfVar.mo1845e(22, lM16204u2.longValue());
        }
        Long lM16204u3 = lyy.m16204u(lxvVar.f39538b);
        if (lM16204u3 == null) {
            arfVar.mo1846f(23);
        } else {
            arfVar.mo1845e(23, lM16204u3.longValue());
        }
        Long lM16204u4 = lyy.m16204u(lxvVar.f39539c);
        if (lM16204u4 == null) {
            arfVar.mo1846f(24);
        } else {
            arfVar.mo1845e(24, lM16204u4.longValue());
        }
        arfVar.mo1845e(25, lyy.m16184a(lxvVar.f39540d));
        arfVar.mo1845e(26, lyy.m16206w(lxvVar.f39541e));
        arfVar.mo1844d(27, lxvVar.f39542f);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR ABORT INTO `ResourceEntity` (`title`,`experienceId`,`queryableTags`,`queryableEpochTimestamp`,`queryableDuration`,`approximateTotalSize`,`namespaceId`,`partitionId`,`f250ResourceId`,`f250AutoUploadDelay`,`airlockExpiration`,`f250Expiration`,`wipeout`,`deleteAirlockFilesOnceUploaded`,`nonSignedInDataOwners`,`overridenObfuscatedGaiaId`,`uploadTransferHandle`,`relations`,`provenance`,`indexTokens`,`onDeviceId`,`status_addedToAirlockEpochTimestamp`,`status_uploadToF250RequestedEpochTimestamp`,`status_uploadToF250CompletedEpochTimestamp`,`status_airlockFileState`,`status_uploadState`,`status_uploadProgressPercent`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0),?,?,?,?,?,?)";
    }
}
