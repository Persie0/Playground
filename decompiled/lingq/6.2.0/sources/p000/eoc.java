package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class eoc extends wpb implements q9c {

    /* JADX INFO: renamed from: f */
    public final C1045d f37647f;

    /* JADX INFO: renamed from: g */
    public Boolean f37648g;

    /* JADX INFO: renamed from: h */
    public String f37649h;

    public eoc(C1045d c1045d) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        lda.m16130p(c1045d);
        this.f37647f = c1045d;
        this.f37649h = null;
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: A */
    public final void mo11283A(zzbh zzbhVar, zzr zzrVar) {
        lda.m16130p(zzbhVar);
        m11288H(zzrVar);
        m11290J(new wlc(this, (AbstractSafeParcelable) zzbhVar, zzrVar, 0));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: B */
    public final String mo11284B(zzr zzrVar) {
        m11288H(zzrVar);
        C1045d c1045d = this.f37647f;
        try {
            return (String) c1045d.mo5913d().m22074K(new w8d(c1045d, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c1045d.mo5909b().f68080f.m17925c("Failed to get app instance id. appId", xcc.m24449L(zzrVar.f12432a), e);
            return null;
        }
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: C */
    public final List mo11285C(String str, String str2, zzr zzrVar) {
        m11288H(zzrVar);
        String str3 = zzrVar.f12432a;
        lda.m16130p(str3);
        C1045d c1045d = this.f37647f;
        try {
            return (List) c1045d.mo5913d().m22074K(new vkc(this, str3, str, str2, 1)).get();
        } catch (InterruptedException | ExecutionException e) {
            c1045d.mo5909b().f68080f.m17924b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: D */
    public final void mo11286D(zzr zzrVar) {
        lda.m16127m(zzrVar.f12432a);
        lda.m16130p(zzrVar.f12419N);
        m11287G(new hlc(this, zzrVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.wpb
    /* JADX INFO: renamed from: F */
    public final boolean mo3072F(int i, Parcel parcel, Parcel parcel2) {
        List list;
        C1045d c1045d = this.f37647f;
        ArrayList arrayList = null;
        cac u9cVar = null;
        oac gacVar = null;
        int i2 = 0;
        Object[] objArr = 0;
        int i3 = 1;
        switch (i) {
            case 1:
                zzbh zzbhVar = (zzbh) bqb.m4105b(parcel, zzbh.CREATOR);
                zzr zzrVar = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11283A(zzbhVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) bqb.m4105b(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11303r(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11306v(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbh zzbhVar2 = (zzbh) bqb.m4105b(parcel, zzbh.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                bqb.m4109f(parcel);
                lda.m16130p(zzbhVar2);
                lda.m16127m(string);
                m11289I(string, true);
                m11290J(new kr3(this, zzbhVar2, string, 7));
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11300o(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                boolean zM4104a = bqb.m4104a(parcel);
                bqb.m4109f(parcel);
                m11288H(zzrVar5);
                String str = zzrVar5.f12432a;
                lda.m16130p(str);
                try {
                    List<lad> list2 = (List) c1045d.mo5913d().m22074K(new ffb(this, str, 2)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (lad ladVar : list2) {
                        if (zM4104a || !rad.m20510g0(ladVar.f49380c)) {
                            arrayList2.add(new zzpl(ladVar));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e) {
                    c1045d.mo5909b().f68080f.m17925c("Failed to get user properties. appId", xcc.m24449L(str), e);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbh zzbhVar3 = (zzbh) bqb.m4105b(parcel, zzbh.CREATOR);
                String string2 = parcel.readString();
                bqb.m4109f(parcel);
                byte[] bArrMo11298m = mo11298m(zzbhVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo11298m);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                bqb.m4109f(parcel);
                mo11293g(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                String strMo11284B = mo11284B(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strMo11284B);
                return true;
            case 12:
                zzah zzahVar = (zzah) bqb.m4105b(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11292c(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) bqb.m4105b(parcel, zzah.CREATOR);
                bqb.m4109f(parcel);
                lda.m16130p(zzahVar2);
                lda.m16130p(zzahVar2.f12378c);
                lda.m16127m(zzahVar2.f12376a);
                m11289I(zzahVar2.f12376a, true);
                m11290J(new kj3(this, new zzah(zzahVar2), objArr == true ? 1 : 0, 17));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean zM4104a2 = bqb.m4104a(parcel);
                zzr zzrVar8 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                List listMo11308z = mo11308z(string6, string7, zM4104a2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo11308z);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean zM4104a3 = bqb.m4104a(parcel);
                bqb.m4109f(parcel);
                List listMo11291a = mo11291a(string8, string9, string10, zM4104a3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo11291a);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzr zzrVar9 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                List listMo11285C = mo11285C(string11, string12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo11285C);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                bqb.m4109f(parcel);
                List listMo11296k = mo11296k(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo11296k);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11294i(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11305t(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11286D(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                zzao zzaoVarMo11304s = mo11304s(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarMo11304s == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzaoVarMo11304s.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzr zzrVar14 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                bqb.m4109f(parcel);
                m11288H(zzrVar14);
                String str2 = zzrVar14.f12432a;
                lda.m16130p(str2);
                if (!c1045d.m5916e0().m4869O(null, z8c.f71140T0)) {
                    try {
                        list = (List) c1045d.mo5913d().m22074K(new mmc(this, zzrVar14, bundle2, i3)).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        c1045d.mo5909b().f68080f.m17925c("Failed to get trigger URIs. appId", xcc.m24449L(str2), e2);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) c1045d.mo5913d().m22075L(new mmc(this, zzrVar14, bundle2, i2)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        c1045d.mo5909b().f68080f.m17925c("Failed to get trigger URIs. appId", xcc.m24449L(str2), e3);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11299n(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11301p(zzrVar16);
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                zzr zzrVar17 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                bqb.m4109f(parcel);
                mo11307x(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) bqb.m4105b(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    gacVar = iInterfaceQueryLocalInterface instanceof oac ? (oac) iInterfaceQueryLocalInterface : new gac(strongBinder);
                }
                bqb.m4109f(parcel);
                mo11297l(zzrVar18, zzooVar, gacVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) bqb.m4105b(parcel, zzaf.CREATOR);
                bqb.m4109f(parcel);
                mo11302q(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                zzr zzrVar20 = (zzr) bqb.m4105b(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    u9cVar = iInterfaceQueryLocalInterface2 instanceof cac ? (cac) iInterfaceQueryLocalInterface2 : new u9c(strongBinder2);
                }
                bqb.m4109f(parcel);
                mo11295j(zzrVar20, bundle3, u9cVar);
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11287G(Runnable runnable) {
        C1045d c1045d = this.f37647f;
        if (c1045d.mo5913d().m22073J()) {
            runnable.run();
        } else {
            c1045d.mo5913d().m22078O(runnable);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m11288H(zzr zzrVar) {
        lda.m16130p(zzrVar);
        String str = zzrVar.f12432a;
        lda.m16127m(str);
        m11289I(str, false);
        this.f37647f.m5928k0().m20524J(zzrVar.f12434b);
    }

    /* JADX INFO: renamed from: I */
    public final void m11289I(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C1045d c1045d = this.f37647f;
        if (zIsEmpty) {
            c1045d.mo5909b().f68080f.m17923a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f37648g == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.f37649h) && !lfa.m16160d(c1045d.f12372l.f47433a, Binder.getCallingUid()) && !wo3.m24090a(c1045d.f12372l.f47433a).m24094c(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.f37648g = Boolean.valueOf(z2);
                }
                if (this.f37648g.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                c1045d.mo5909b().f68080f.m17924b(xcc.m24449L(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f37649h == null) {
            Context context = c1045d.f12372l.f47433a;
            int callingUid = Binder.getCallingUid();
            int i = to3.f62638e;
            if (lfa.m16161e(callingUid, context, str)) {
                this.f37649h = str;
            }
        }
        if (str.equals(this.f37649h)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    /* JADX INFO: renamed from: J */
    public final void m11290J(Runnable runnable) {
        C1045d c1045d = this.f37647f;
        if (c1045d.mo5913d().m22073J()) {
            runnable.run();
        } else {
            c1045d.mo5913d().m22076M(runnable);
        }
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: a */
    public final List mo11291a(String str, String str2, String str3, boolean z) {
        m11289I(str, true);
        C1045d c1045d = this.f37647f;
        try {
            List<lad> list = (List) c1045d.mo5913d().m22074K(new vkc(this, str, str2, str3, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (lad ladVar : list) {
                if (z || !rad.m20510g0(ladVar.f49380c)) {
                    arrayList.add(new zzpl(ladVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            c1045d.mo5909b().f68080f.m17925c("Failed to get user properties as. appId", xcc.m24449L(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: c */
    public final void mo11292c(zzah zzahVar, zzr zzrVar) {
        lda.m16130p(zzahVar);
        lda.m16130p(zzahVar.f12378c);
        m11288H(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.f12376a = zzrVar.f12432a;
        m11290J(new kr3(this, zzahVar2, zzrVar, 6));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: g */
    public final void mo11293g(long j, String str, String str2, String str3) {
        m11290J(new dkc(this, str2, str3, str, j, 0));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: i */
    public final void mo11294i(zzr zzrVar) {
        String str = zzrVar.f12432a;
        lda.m16127m(str);
        m11289I(str, false);
        m11290J(new llc(this, zzrVar, 0));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: j */
    public final void mo11295j(zzr zzrVar, Bundle bundle, cac cacVar) {
        m11288H(zzrVar);
        String str = zzrVar.f12432a;
        lda.m16130p(str);
        this.f37647f.mo5913d().m22076M(new xmc(this, zzrVar, bundle, cacVar, str, 0));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: k */
    public final List mo11296k(String str, String str2, String str3) {
        m11289I(str, true);
        C1045d c1045d = this.f37647f;
        try {
            return (List) c1045d.mo5913d().m22074K(new vkc(this, str, str2, str3, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            c1045d.mo5909b().f68080f.m17924b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: l */
    public final void mo11297l(zzr zzrVar, zzoo zzooVar, oac oacVar) {
        m11288H(zzrVar);
        String str = zzrVar.f12432a;
        lda.m16130p(str);
        this.f37647f.mo5913d().m22076M(new jo0(this, str, zzooVar, oacVar, 2, false));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: m */
    public final byte[] mo11298m(zzbh zzbhVar, String str) {
        lda.m16127m(str);
        lda.m16130p(zzbhVar);
        m11289I(str, true);
        C1045d c1045d = this.f37647f;
        occ occVar = c1045d.mo5909b().f68075H;
        kjc kjcVar = c1045d.f12372l;
        rbc rbcVar = kjcVar.f47442j;
        String str2 = zzbhVar.f12389a;
        occVar.m17924b(rbcVar.m20572a(str2), "Log and bundle. event");
        c1045d.mo5911c().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) c1045d.mo5913d().m22075L(new z06(this, zzbhVar, str)).get();
            if (bArr == null) {
                c1045d.mo5909b().f68080f.m17924b(xcc.m24449L(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            c1045d.mo5911c().getClass();
            c1045d.mo5909b().f68075H.m17926d("Log and bundle processed. event, size, time_ms", kjcVar.f47442j.m20572a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            c1045d.mo5909b().f68080f.m17926d("Failed to log and bundle. appId, event, error", xcc.m24449L(str), kjcVar.f47442j.m20572a(str2), e);
            return null;
        }
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: n */
    public final void mo11299n(zzr zzrVar) {
        lda.m16127m(zzrVar.f12432a);
        lda.m16130p(zzrVar.f12419N);
        m11287G(new hlc(this, zzrVar, 2));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: o */
    public final void mo11300o(zzr zzrVar) {
        m11288H(zzrVar);
        m11290J(new hlc(this, zzrVar, 0));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: p */
    public final void mo11301p(zzr zzrVar) {
        lda.m16127m(zzrVar.f12432a);
        lda.m16130p(zzrVar.f12419N);
        m11287G(new llc(this, zzrVar, 1));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: q */
    public final void mo11302q(zzr zzrVar, zzaf zzafVar) {
        m11288H(zzrVar);
        m11290J(new kr3(8, this, zzrVar, zzafVar, false));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: r */
    public final void mo11303r(zzpl zzplVar, zzr zzrVar) {
        lda.m16130p(zzplVar);
        m11288H(zzrVar);
        m11290J(new wlc(this, (AbstractSafeParcelable) zzplVar, zzrVar, 1));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: s */
    public final zzao mo11304s(zzr zzrVar) {
        m11288H(zzrVar);
        String str = zzrVar.f12432a;
        lda.m16127m(str);
        C1045d c1045d = this.f37647f;
        try {
            return (zzao) c1045d.mo5913d().m22075L(new ffb(this, zzrVar, 3)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c1045d.mo5909b().f68080f.m17925c("Failed to get consent. appId", xcc.m24449L(str), e);
            return new zzao(null);
        }
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: t */
    public final void mo11305t(Bundle bundle, zzr zzrVar) {
        m11288H(zzrVar);
        String str = zzrVar.f12432a;
        lda.m16130p(str);
        m11290J(new wnc(0, this, bundle, zzrVar, str));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: v */
    public final void mo11306v(zzr zzrVar) {
        m11288H(zzrVar);
        m11290J(new ujc(this, zzrVar, 0));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: x */
    public final void mo11307x(zzr zzrVar) {
        m11288H(zzrVar);
        m11290J(new ujc(this, zzrVar, 1));
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: z */
    public final List mo11308z(String str, String str2, boolean z, zzr zzrVar) {
        m11288H(zzrVar);
        String str3 = zzrVar.f12432a;
        lda.m16130p(str3);
        C1045d c1045d = this.f37647f;
        try {
            List<lad> list = (List) c1045d.mo5913d().m22074K(new qkc(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (lad ladVar : list) {
                if (z || !rad.m20510g0(ladVar.f49380c)) {
                    arrayList.add(new zzpl(ladVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            c1045d.mo5909b().f68080f.m17925c("Failed to query user properties. appId", xcc.m24449L(str3), e);
            return Collections.EMPTY_LIST;
        }
    }
}
