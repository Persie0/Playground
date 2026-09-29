package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzsk;
import com.google.android.gms.internal.measurement.zzxd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.C1114d;
import com.google.common.util.concurrent.C1117g;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class cdb implements a58, tr6, fmb, bm1, agd, InterfaceC3016fw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9944a;

    /* JADX INFO: renamed from: b */
    public Object f9945b;

    /* JADX INFO: renamed from: c */
    public Object f9946c;

    public cdb(int i) {
        this.f9944a = i;
        switch (i) {
            case 11:
                this.f9945b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f9946c = new ReferenceQueue();
                break;
            case 25:
                this.f9945b = new TreeMap();
                this.f9946c = new TreeMap();
                break;
            default:
                this.f9945b = new HashMap();
                this.f9946c = new gnb(6);
                gnb gnbVar = new gnb(0);
                zzbk zzbkVar = zzbk.BITWISE_AND;
                ArrayList arrayList = gnbVar.f41057a;
                arrayList.add(zzbkVar);
                arrayList.add(zzbk.BITWISE_LEFT_SHIFT);
                arrayList.add(zzbk.BITWISE_NOT);
                arrayList.add(zzbk.BITWISE_OR);
                arrayList.add(zzbk.BITWISE_RIGHT_SHIFT);
                arrayList.add(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(zzbk.BITWISE_XOR);
                m4561i(gnbVar);
                gnb gnbVar2 = new gnb(1);
                zzbk zzbkVar2 = zzbk.EQUALS;
                ArrayList arrayList2 = gnbVar2.f41057a;
                arrayList2.add(zzbkVar2);
                arrayList2.add(zzbk.GREATER_THAN);
                arrayList2.add(zzbk.GREATER_THAN_EQUALS);
                arrayList2.add(zzbk.IDENTITY_EQUALS);
                arrayList2.add(zzbk.IDENTITY_NOT_EQUALS);
                arrayList2.add(zzbk.LESS_THAN);
                arrayList2.add(zzbk.LESS_THAN_EQUALS);
                arrayList2.add(zzbk.NOT_EQUALS);
                m4561i(gnbVar2);
                gnb gnbVar3 = new gnb(2);
                zzbk zzbkVar3 = zzbk.APPLY;
                ArrayList arrayList3 = gnbVar3.f41057a;
                arrayList3.add(zzbkVar3);
                arrayList3.add(zzbk.BLOCK);
                arrayList3.add(zzbk.BREAK);
                arrayList3.add(zzbk.CASE);
                arrayList3.add(zzbk.DEFAULT);
                arrayList3.add(zzbk.CONTINUE);
                arrayList3.add(zzbk.DEFINE_FUNCTION);
                arrayList3.add(zzbk.FN);
                arrayList3.add(zzbk.IF);
                arrayList3.add(zzbk.QUOTE);
                arrayList3.add(zzbk.RETURN);
                arrayList3.add(zzbk.SWITCH);
                arrayList3.add(zzbk.TERNARY);
                m4561i(gnbVar3);
                gnb gnbVar4 = new gnb(3);
                zzbk zzbkVar4 = zzbk.AND;
                ArrayList arrayList4 = gnbVar4.f41057a;
                arrayList4.add(zzbkVar4);
                arrayList4.add(zzbk.NOT);
                arrayList4.add(zzbk.OR);
                m4561i(gnbVar4);
                gnb gnbVar5 = new gnb(4);
                zzbk zzbkVar5 = zzbk.FOR_IN;
                ArrayList arrayList5 = gnbVar5.f41057a;
                arrayList5.add(zzbkVar5);
                arrayList5.add(zzbk.FOR_IN_CONST);
                arrayList5.add(zzbk.FOR_IN_LET);
                arrayList5.add(zzbk.FOR_LET);
                arrayList5.add(zzbk.FOR_OF);
                arrayList5.add(zzbk.FOR_OF_CONST);
                arrayList5.add(zzbk.FOR_OF_LET);
                arrayList5.add(zzbk.WHILE);
                m4561i(gnbVar5);
                gnb gnbVar6 = new gnb(5);
                zzbk zzbkVar6 = zzbk.ADD;
                ArrayList arrayList6 = gnbVar6.f41057a;
                arrayList6.add(zzbkVar6);
                arrayList6.add(zzbk.DIVIDE);
                arrayList6.add(zzbk.MODULUS);
                arrayList6.add(zzbk.MULTIPLY);
                arrayList6.add(zzbk.NEGATE);
                arrayList6.add(zzbk.POST_DECREMENT);
                arrayList6.add(zzbk.POST_INCREMENT);
                arrayList6.add(zzbk.PRE_DECREMENT);
                arrayList6.add(zzbk.PRE_INCREMENT);
                arrayList6.add(zzbk.SUBTRACT);
                m4561i(gnbVar6);
                gnb gnbVar7 = new gnb(7);
                zzbk zzbkVar7 = zzbk.ASSIGN;
                ArrayList arrayList7 = gnbVar7.f41057a;
                arrayList7.add(zzbkVar7);
                arrayList7.add(zzbk.CONST);
                arrayList7.add(zzbk.CREATE_ARRAY);
                arrayList7.add(zzbk.CREATE_OBJECT);
                arrayList7.add(zzbk.EXPRESSION_LIST);
                arrayList7.add(zzbk.GET);
                arrayList7.add(zzbk.GET_INDEX);
                arrayList7.add(zzbk.GET_PROPERTY);
                arrayList7.add(zzbk.NULL);
                arrayList7.add(zzbk.SET_PROPERTY);
                arrayList7.add(zzbk.TYPEOF);
                arrayList7.add(zzbk.UNDEFINED);
                arrayList7.add(zzbk.VAR);
                m4561i(gnbVar7);
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public static cdb m4554j(bhb bhbVar) {
        return new cdb(bhbVar);
    }

    @Override // p000.fmb
    /* JADX INFO: renamed from: a */
    public Object mo4555a() {
        HashMap map;
        Map map2;
        HashMap mapM14446a;
        aib aibVar = (aib) this.f9945b;
        jgb jgbVar = (jgb) this.f9946c;
        jgbVar.getClass();
        if (aib.m445d() ? ((Boolean) aib.m444b(new C3404oc("gms:phenotype:phenotype_flag:debug_disable_caching", 5))).booleanValue() : false) {
            mapM14446a = jgbVar.m14446a();
        } else {
            map = jgbVar.f45530e;
        }
        if (map2 == null) {
            map2 = map;
            map2 = mapM14446a;
            synchronized (jgbVar.f45529d) {
                try {
                    HashMap map3 = jgbVar.f45530e;
                    map2 = map3;
                    if (map3 == null) {
                        HashMap mapM14446a2 = jgbVar.m14446a();
                        jgbVar.f45530e = mapM14446a2;
                        map2 = mapM14446a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.EMPTY_MAP;
        }
        return (String) map2.get(aibVar.f717b);
    }

    @Override // p000.a58
    public void accept(Object obj, Object obj2) {
        switch (this.f9944a) {
            case 2:
                vdb vdbVar = new vdb((xdb) this.f9945b, (wr9) obj2);
                kdb kdbVar = (kdb) ((ceb) obj).m11611l();
                ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) this.f9946c;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(kdbVar.f51090h);
                int i = zcb.f71374a;
                parcelObtain.writeStrongBinder(vdbVar);
                zcb.m25555b(parcelObtain, apiFeatureRequest);
                parcelObtain.writeStrongBinder(null);
                kdbVar.m16769F(parcelObtain, 2);
                break;
            default:
                yeb yebVar = new yeb((eeb) this.f9945b, (wr9) obj2);
                ueb uebVar = (ueb) ((reb) obj).m11611l();
                AuthorizationRequest authorizationRequest = (AuthorizationRequest) this.f9946c;
                ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, 0, true), false);
                apiMetadata.f11649c = false;
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(uebVar.f51090h);
                int i2 = meb.f51223a;
                parcelObtain2.writeStrongBinder(yebVar);
                meb.m16798b(parcelObtain2, authorizationRequest);
                meb.m16798b(parcelObtain2, apiMetadata);
                uebVar.m16770G(parcelObtain2, 1);
                break;
        }
    }

    @Override // p000.agd
    /* JADX INFO: renamed from: b */
    public Object mo391b(ny8 ny8Var) throws IOException {
        Uri uri = (Uri) ny8Var.f53417e;
        AtomicLong atomicLong = mid.f51376a;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = mid.f51376a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        StringBuilder sb = new StringBuilder(length + 15 + String.valueOf(id).length() + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(jCurrentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        uid uidVar = (uid) ny8Var.f53414b;
        ArrayList arrayListM17690R = ny8Var.m17690R(uidVar.mo14451e(uriBuild));
        cdb[] cdbVarArr = (cdb[]) this.f9946c;
        if (cdbVarArr != null) {
            cdbVarArr[0].m4560h(arrayListM17690R);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListM17690R.get(0);
            try {
                bhb bhbVar = (bhb) this.f9945b;
                bhbVar.getClass();
                whb whbVar = (whb) bhbVar;
                int iM23968l = whbVar.m23968l();
                boolean z = nhb.f52743b;
                if (iM23968l > 4096) {
                    iM23968l = 4096;
                }
                ihb ihbVar = new ihb(outputStream, iM23968l);
                whbVar.m23961e(ihbVar);
                ihbVar.m13926C();
                cdb[] cdbVarArr2 = (cdb[]) this.f9946c;
                if (cdbVarArr2 != null) {
                    cdb cdbVar = cdbVarArr2[0];
                    if (((rhd) cdbVar.f9946c) == null) {
                        throw new zzsk("Cannot sync underlying stream");
                    }
                    ((OutputStream) cdbVar.f9945b).flush();
                    ((rhd) cdbVar.f9946c).f59334a.getFD().sync();
                }
                outputStream.close();
                uidVar.mo14453g(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                uidVar.mo14452f(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public qg5 m4556c() {
        return (qg5) this.f9945b;
    }

    @Override // p000.InterfaceC3016fw
    public ListenableFuture call() {
        switch (this.f9944a) {
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ckd ckdVar = (ckd) this.f9946c;
                String strValueOf = String.valueOf(ckdVar.f10200a);
                to2 to2Var = ckdVar.f10207h;
                String strConcat = "Initialize ".concat(strValueOf);
                zzxd zzxdVar = zzxd.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS;
                to2Var.getClass();
                zld zldVarM22257l = to2.m22257l(strConcat, zzxdVar);
                try {
                    synchronized (ckdVar.f10206g) {
                        try {
                            if (((List) this.f9945b) == null) {
                                this.f9945b = ckdVar.f10208i;
                                ckdVar.f10208i = Collections.EMPTY_LIST;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    ArrayList arrayList = new ArrayList(((List) this.f9945b).size());
                    xkd xkdVar = new xkd((ckd) this.f9946c);
                    Iterator it = ((List) this.f9945b).iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(((InterfaceC3053gw) it.next()).apply(xkdVar));
                        } catch (Exception e) {
                            arrayList.add(new x04(e));
                        }
                    }
                    C1114d c1114dM6395a = new C1117g(true, ImmutableList.m6286o(arrayList)).m6395a(new z06(this, 10), AbstractC1120j.m6404a());
                    zldVarM22257l.m25697a(c1114dM6395a);
                    zldVarM22257l.close();
                    return c1114dM6395a;
                } catch (Throwable th2) {
                    try {
                        zldVarM22257l.close();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                gmd gmdVar = (gmd) this.f9945b;
                fmd fmdVarM20022c = qld.m20022c();
                gmd gmdVarM20021b = qld.m20021b(fmdVarM20022c, gmdVar);
                try {
                    ListenableFuture listenableFutureCall = ((InterfaceC3016fw) this.f9946c).call();
                    qld.m20021b(fmdVarM20022c, gmdVarM20021b);
                    listenableFutureCall.getClass();
                    return listenableFutureCall;
                } catch (Throwable th4) {
                    try {
                        pld.m19392a(th4);
                        throw th4;
                    } catch (Throwable th5) {
                        qld.m20021b(fmdVarM20022c, gmdVarM20021b);
                        throw th5;
                    }
                }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4557d(long j, Bundle bundle, String str, String str2) {
        try {
            ((nvb) this.f9945b).mo10690h(j, bundle, str, str2);
        } catch (RemoteException e) {
            kjc kjcVar = ((AppMeasurementDynamiteService) this.f9946c).f12312f;
            if (kjcVar != null) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17924b(e, "Event interceptor threw exception");
            }
        }
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        Bundle bundle;
        switch (this.f9944a) {
            case 14:
                boolean z = task.mo5966h() instanceof UnsupportedApiCallException;
                x0d x0dVar = (x0d) this.f9946c;
                ltc ltcVar = (ltc) this.f9945b;
                if (z) {
                    return ltcVar.m16543d(x0dVar.m24231s());
                }
                if (!(task.mo5966h() instanceof ApiException)) {
                    return task;
                }
                ApiException apiException = (ApiException) task.mo5966h();
                apiException.getClass();
                return apiException.f11645a.f11662a == 29514 ? ltcVar.m16543d(x0dVar.m24231s()) : task;
            default:
                wj8 wj8Var = (wj8) this.f9945b;
                Bundle bundle2 = (Bundle) this.f9946c;
                wj8Var.getClass();
                return (task.mo5971m() && (bundle = (Bundle) task.mo5967i()) != null && bundle.containsKey("google.messenger")) ? wj8Var.m24020a(bundle2).mo5972n(qg2.f57747c, my5.f52035f) : task;
        }
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public void mo4558f(Task task) {
        switch (this.f9944a) {
            case 3:
                ((Map) ((qfa) this.f9946c).f57706b).remove((wr9) this.f9945b);
                return;
            default:
                ajd ajdVar = (ajd) this.f9945b;
                wr9 wr9Var = (wr9) this.f9946c;
                synchronized (ajdVar.f740f) {
                    ajdVar.f739e.remove(wr9Var);
                    break;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4559g(Throwable th) {
        C1043b c1043b = (C1043b) this.f9946c;
        c1043b.mo12359D();
        kjc kjcVar = (kjc) c1043b.f60774a;
        c1043b.f12331i = false;
        c1043b.m5871b0().add((zzoh) this.f9945b);
        if (c1043b.f12332j > ((Integer) z8c.f71206v0.m21901a(null)).intValue()) {
            c1043b.f12332j = 1;
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17925c("registerTriggerAsync failed. May try later. App ID, throwable", xcc.m24449L(kjcVar.m15289q().m21928J()), xcc.m24449L(th.toString()));
            return;
        }
        xcc xccVar2 = kjcVar.f47438f;
        kjc.m15280l(xccVar2);
        xccVar2.f68083i.m17926d("registerTriggerAsync failed. App ID, delay in seconds, throwable", xcc.m24449L(kjcVar.m15289q().m21928J()), xcc.m24449L(String.valueOf(c1043b.f12332j)), xcc.m24449L(th.toString()));
        int i = c1043b.f12332j;
        if (c1043b.f12333k == null) {
            c1043b.f12333k = new tqc(c1043b, (uoc) kjcVar, 1);
        }
        c1043b.f12333k.m25215b(((long) i) * 1000);
        int i2 = c1043b.f12332j;
        c1043b.f12332j = i2 + i2;
    }

    /* JADX INFO: renamed from: h */
    public void m4560h(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) sgd.m21369a(arrayList);
        if (outputStream instanceof rhd) {
            this.f9946c = (rhd) outputStream;
            this.f9945b = (OutputStream) arrayList.get(0);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m4561i(gnb gnbVar) {
        Iterator it = gnbVar.f41057a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f9945b).put(((zzbk) it.next()).zzb().toString(), gnbVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public kmb m4562k(C3329mb c3329mb, kmb kmbVar) {
        qdd.m19885l(c3329mb);
        if (!(kmbVar instanceof rmb)) {
            return kmbVar;
        }
        rmb rmbVar = (rmb) kmbVar;
        ArrayList arrayList = rmbVar.f59556b;
        String str = rmbVar.f59555a;
        HashMap map = (HashMap) this.f9945b;
        return (map.containsKey(str) ? (gnb) map.get(str) : (gnb) this.f9946c).m12776a(str, c3329mb, arrayList);
    }

    /* JADX INFO: renamed from: l */
    public void m4563l(C3329mb c3329mb, mq7 mq7Var) {
        vvc vvcVar = new vvc(mq7Var);
        TreeMap treeMap = (TreeMap) this.f9945b;
        for (Integer num : treeMap.keySet()) {
            ofb ofbVarClone = ((ofb) mq7Var.f51734c).clone();
            kmb kmbVarMo12757a = ((gmb) treeMap.get(num)).mo12757a(c3329mb, Collections.singletonList(vvcVar));
            int iM19881h = kmbVarMo12757a instanceof bkb ? qdd.m19881h(((bkb) kmbVarMo12757a).f8647a.doubleValue()) : -1;
            if (iM19881h == 2 || iM19881h == -1) {
                mq7Var.f51734c = ofbVarClone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f9946c;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            kmb kmbVarMo12757a2 = ((gmb) treeMap2.get((Integer) it.next())).mo12757a(c3329mb, Collections.singletonList(vvcVar));
            if (kmbVarMo12757a2 instanceof bkb) {
                qdd.m19881h(((bkb) kmbVarMo12757a2).f8647a.doubleValue());
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m4564m(cdb... cdbVarArr) {
        this.f9946c = cdbVarArr;
    }

    public String toString() {
        switch (this.f9944a) {
            case 24:
                InterfaceC3016fw interfaceC3016fw = (InterfaceC3016fw) this.f9946c;
                StringBuilder sb = new StringBuilder(interfaceC3016fw.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(interfaceC3016fw);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ cdb(int i, boolean z) {
        this.f9944a = i;
    }

    public /* synthetic */ cdb(Object obj, Object obj2, boolean z, int i) {
        this.f9944a = i;
        this.f9945b = obj;
        this.f9946c = obj2;
    }

    public cdb(bhb bhbVar) {
        this.f9944a = 21;
        this.f9945b = bhbVar;
    }

    public /* synthetic */ cdb(boolean z) {
        this.f9944a = 20;
    }

    public /* synthetic */ cdb(int i, Object obj, Object obj2) {
        this.f9944a = i;
        this.f9946c = obj;
        this.f9945b = obj2;
    }

    public cdb(ca1 ca1Var) {
        this.f9944a = 22;
        this.f9946c = new p29();
        this.f9945b = ca1Var;
        mkd.m16909o();
    }

    public cdb(mq7 mq7Var) {
        this.f9944a = 16;
        this.f9946c = new p29();
        this.f9945b = mq7Var;
        a3d.m80r();
    }

    public cdb(qfa qfaVar, wr9 wr9Var) {
        this.f9944a = 3;
        this.f9945b = wr9Var;
        Objects.requireNonNull(qfaVar);
        this.f9946c = qfaVar;
    }

    public cdb(IBinder iBinder) throws RemoteException {
        this.f9944a = 19;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f9945b = new Messenger(iBinder);
            this.f9946c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f9946c = new zzd(iBinder);
            this.f9945b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public cdb(AppMeasurementSdk appMeasurementSdk, b64 b64Var) {
        this.f9944a = 10;
        this.f9946c = b64Var;
        appMeasurementSdk.m5845a(new zvb(this));
        this.f9945b = new HashSet();
    }

    public /* synthetic */ cdb(ckd ckdVar) {
        this.f9944a = 23;
        this.f9946c = ckdVar;
    }
}
