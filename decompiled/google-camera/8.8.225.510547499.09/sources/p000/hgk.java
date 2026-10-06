package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p021j$.util.Collection$EL;
import p021j$.util.Optional;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hgk implements hgd, fbp {

    /* JADX INFO: renamed from: h */
    public final Context f27672h;

    /* JADX INFO: renamed from: i */
    public final PackageManager f27673i;

    /* JADX INFO: renamed from: j */
    public final Resources f27674j;

    /* JADX INFO: renamed from: k */
    public final hgm f27675k;

    /* JADX INFO: renamed from: l */
    public final hfo f27676l;

    /* JADX INFO: renamed from: m */
    public final chv f27677m;

    /* JADX INFO: renamed from: n */
    public final hfx f27678n;

    /* JADX INFO: renamed from: o */
    public final Handler f27679o;

    /* JADX INFO: renamed from: p */
    public final hgb f27680p;

    /* JADX INFO: renamed from: q */
    public final Runnable f27681q;

    /* JADX INFO: renamed from: r */
    public final hgp f27682r;

    /* JADX INFO: renamed from: s */
    public final hhi f27683s;

    /* JADX INFO: renamed from: t */
    public chp f27684t;

    /* JADX INFO: renamed from: u */
    public ResolveInfo f27685u;

    /* JADX INFO: renamed from: v */
    public boolean f27686v;

    /* JADX INFO: renamed from: w */
    public final ihk f27687w;

    public hgk(Context context, hgm hgmVar, hfo hfoVar, chv chvVar, hfx hfxVar, Handler handler, PackageManager packageManager, Resources resources, hgp hgpVar, hgb hgbVar, ihk ihkVar, hhi hhiVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f27672h = context;
        this.f27675k = hgmVar;
        this.f27676l = hfoVar;
        this.f27677m = chvVar;
        this.f27678n = hfxVar;
        this.f27679o = handler;
        this.f27682r = hgpVar;
        this.f27680p = hgbVar;
        this.f27687w = ihkVar;
        this.f27683s = hhiVar;
        Integer.toHexString(hashCode());
        this.f27681q = new hfr(this, 3);
        this.f27673i = packageManager;
        this.f27674j = resources;
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo10196a() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo10197b(chp chpVar, boolean z) {
    }

    @Override // p000.hgd, p000.fbl
    /* JADX INFO: renamed from: bF */
    public /* synthetic */ void mo3523bF() {
    }

    @Override // p000.hgd, p000.ezs
    /* JADX INFO: renamed from: bH */
    public /* synthetic */ boolean mo3807bH() {
        return false;
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: cb */
    public /* synthetic */ void mo10198cb() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void mo10199d(chp chpVar, boolean z) {
    }

    /* JADX INFO: renamed from: f */
    public /* synthetic */ void mo5711f() {
    }

    /* JADX INFO: renamed from: g */
    public /* synthetic */ void mo5712g() {
    }

    /* JADX INFO: renamed from: h */
    public /* synthetic */ void mo5713h() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void mo10200i() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void mo10201j() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void mo10202k() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void mo10203l(ResolveInfo resolveInfo) {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo10204m() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void mo10205n() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void mo10206o() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void mo10207p(long j) {
    }

    /* JADX INFO: renamed from: q */
    public final nps m10244q(chp chpVar) {
        hfx hfxVar = this.f27678n;
        String strM10218b = hfx.m10218b(hfx.m10217a(chpVar));
        List listMo10266c = hfxVar.f27638a.mo10266c("image/*");
        List listMo10266c2 = hfxVar.f27638a.mo10266c("video/*");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(listMo10266c);
        arrayList2.addAll(listMo10266c2);
        hfxVar.f27638a.mo10271h((List) Collection$EL.stream(arrayList2).filter(hfx.m10219c(egh.f13955u)).collect(Collectors.toList()));
        boolean zM10220d = hfx.m10220d(strM10218b);
        boolean zM10221g = hfx.m10221g(strM10218b);
        hzv hzvVarM10314a = hhs.m10314a();
        hzvVarM10314a.m10972j(zM10220d);
        byte[] bArr = null;
        Collection$EL.forEach(listMo10266c, new fdg(hfxVar, arrayList, hzvVarM10314a, 4, bArr));
        hzvVarM10314a.m10972j(zM10221g);
        Collection$EL.forEach(listMo10266c2, new fdg(hfxVar, arrayList, hzvVarM10314a, 5, bArr));
        ArrayList arrayList3 = (ArrayList) Collection$EL.stream(arrayList).sorted(new kqb(hfxVar, 1)).filter(hfx.m10219c(egh.f13954t)).collect(Collectors.toCollection(drv.f12450d));
        if (hfxVar.f27641d.mo6184l(dib.f11324be)) {
            Optional optionalFindFirst = Collection$EL.stream(hfxVar.f27638a.mo10267d(strM10218b)).filter(new gfw(hfxVar, 9)).findFirst();
            if (optionalFindFirst.isPresent()) {
                hzv hzvVarM10314a2 = hhs.m10314a();
                hzvVarM10314a2.m10970h((ResolveInfo) optionalFindFirst.get());
                hzvVarM10314a2.m10971i(true);
                hzvVarM10314a2.m10972j(true);
                hzvVarM10314a2.m10969g(true);
                arrayList3.add(hzvVarM10314a2.m10968f());
            }
        }
        hzv hzvVarM10314a3 = hhs.m10314a();
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        Collection$EL.stream(arrayList3).forEachOrdered(new cwu(atomicInteger, atomicInteger2, 5));
        hzvVarM10314a3.m10970h((atomicInteger.get() >= 3 || atomicInteger2.get() <= 0) ? hfxVar.m10224h(3) : hfxVar.m10224h(2));
        hzvVarM10314a3.m10971i(true);
        hzvVarM10314a3.m10972j(true);
        arrayList3.add(hzvVarM10314a3.m10968f());
        Collection$EL.removeIf(arrayList3, fjv.f22318l);
        List<ResolveInfo> list = (List) Collection$EL.stream(arrayList3).map(hgq.f27708b).collect(Collectors.toList());
        hgb hgbVar = this.f27680p;
        Context context = this.f27672h;
        lku.m15613H(hgbVar.f27657c);
        if (!((Boolean) hgbVar.f27655a.mo10031c(gzy.f27005Q)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(context.getPackageName());
            arrayList4.addAll(hgu.f27749c);
            ArrayList arrayList5 = new ArrayList();
            for (ResolveInfo resolveInfo : list) {
                if (!arrayList4.contains(resolveInfo.activityInfo.packageName)) {
                    arrayList5.add(resolveInfo);
                }
            }
            if (!arrayList5.isEmpty()) {
                hgbVar.f27656b.mo10033e(gzy.f27005Q, true);
            }
        }
        return this.f27683s.mo10298a(arrayList3);
    }

    /* JADX INFO: renamed from: r */
    public final void m10245r(boolean z, boolean z2) {
        this.f27683s.mo10300c(z);
        this.f27676l.mo10186c(z);
        this.f27686v = true;
        this.f27684t = null;
        hgb hgbVar = this.f27680p;
        if (hgbVar.f27657c) {
            hgbVar.m10232c();
        }
        if (z2) {
            this.f27682r.mo7757a();
            this.f27682r.mo7758b();
        }
    }
}
