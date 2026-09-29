package p000;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: tw */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3626tw implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62971a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f62972b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f62973c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f62974d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f62975e;

    public /* synthetic */ RunnableC3626tw(cyc cycVar, int i, Exception exc, byte[] bArr, Map map) {
        this.f62971a = 2;
        this.f62973c = cycVar;
        this.f62972b = i;
        this.f62974d = exc;
        this.f62975e = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x01fe A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:14:0x005b, B:16:0x007c, B:18:0x0082, B:20:0x0088, B:23:0x0097, B:27:0x00a1, B:31:0x00ab, B:34:0x00b3, B:35:0x00be), top: B:161:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab A[Catch: all -> 0x009d, PHI: r3
      0x00ab: PHI (r3v13 android.net.Uri) = (r3v17 android.net.Uri), (r3v15 android.net.Uri) binds: [B:26:0x009f, B:30:0x00aa] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x009d, blocks: (B:14:0x005b, B:16:0x007c, B:18:0x0082, B:20:0x0088, B:23:0x0097, B:27:0x00a1, B:31:0x00ab, B:34:0x00b3, B:35:0x00be), top: B:161:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        eg2 eg2Var;
        ag2 ag2Var;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Uri uriM3674b;
        int i16 = this.f62971a;
        int i17 = 0;
        GmsDocumentScanningResult gmsDocumentScanningResultM6773c = null;
        gmsDocumentScanningResultM6773c = null;
        gmsDocumentScanningResultM6773c = null;
        Uri uri = null;
        gmsDocumentScanningResultM6773c = null;
        int i18 = this.f62972b;
        Object obj2 = this.f62975e;
        Object obj3 = this.f62974d;
        Object obj4 = this.f62973c;
        switch (i16) {
            case 0:
                vj6 vj6Var = new vj6(this, 4);
                int size = ((List) obj4).size();
                int size2 = ((List) obj3).size();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                dg2 dg2Var = new dg2();
                dg2Var.f35587a = 0;
                dg2Var.f35588b = size;
                dg2Var.f35589c = 0;
                dg2Var.f35590d = size2;
                arrayList2.add(dg2Var);
                int i19 = size + size2;
                int i20 = 1;
                int i21 = (((i19 + 1) / 2) * 2) + 1;
                int[] iArr = new int[i21];
                int i22 = i21 / 2;
                int[] iArr2 = new int[i21];
                ArrayList arrayList3 = new ArrayList();
                while (!arrayList2.isEmpty()) {
                    dg2 dg2Var2 = (dg2) arrayList2.remove(arrayList2.size() - i20);
                    if (dg2Var2.m10327b() < i20 || dg2Var2.m10326a() < i20) {
                        obj = obj2;
                        i = i22;
                        eg2Var = null;
                    } else {
                        int iM10326a = ((dg2Var2.m10326a() + dg2Var2.m10327b()) + i20) / 2;
                        int i23 = i20 + i22;
                        iArr[i23] = dg2Var2.f35587a;
                        iArr2[i23] = dg2Var2.f35588b;
                        int i24 = i17;
                        while (true) {
                            if (i24 < iM10326a) {
                                int i25 = Math.abs(dg2Var2.m10327b() - dg2Var2.m10326a()) % 2 == i20 ? i20 : i17;
                                int iM10327b = dg2Var2.m10327b() - dg2Var2.m10326a();
                                int i26 = -i24;
                                int i27 = i26;
                                while (true) {
                                    if (i27 <= i24) {
                                        if (i27 != i26) {
                                            if (i27 != i24) {
                                                obj = obj2;
                                                if (iArr[i27 + 1 + i22] > iArr[(i27 - 1) + i22]) {
                                                }
                                                i9 = i27;
                                                i10 = ((i8 - dg2Var2.f35587a) + dg2Var2.f35589c) - i9;
                                                if (i24 == 0 && i8 == i7) {
                                                    i11 = i10 - 1;
                                                } else {
                                                    i11 = i10;
                                                }
                                                int i28 = i22;
                                                i12 = i10;
                                                i13 = i8;
                                                i = i28;
                                                i2 = iM10326a;
                                                while (i13 < dg2Var2.f35588b && i12 < dg2Var2.f35590d && vj6Var.m23344p(i13, i12)) {
                                                    i13++;
                                                    i12++;
                                                }
                                                iArr[i9 + i] = i13;
                                                if (i25 != 0) {
                                                    i15 = iM10327b - i9;
                                                    i14 = i25;
                                                    if (i15 < i26 + 1 && i15 <= i24 - 1 && iArr2[i15 + i] <= i13) {
                                                        eg2Var = new eg2();
                                                        eg2Var.f37201a = i7;
                                                        eg2Var.f37202b = i11;
                                                        eg2Var.f37203c = i13;
                                                        eg2Var.f37204d = i12;
                                                        eg2Var.f37205e = false;
                                                    }
                                                } else {
                                                    i14 = i25;
                                                }
                                                i27 = i9 + 2;
                                                obj2 = obj;
                                                i22 = i;
                                                iM10326a = i2;
                                                i25 = i14;
                                            } else {
                                                obj = obj2;
                                            }
                                            i7 = iArr[(i27 - 1) + i22];
                                            i8 = i7 + 1;
                                            i9 = i27;
                                            i10 = ((i8 - dg2Var2.f35587a) + dg2Var2.f35589c) - i9;
                                            if (i24 == 0) {
                                                i11 = i10;
                                            } else {
                                                i11 = i10;
                                            }
                                            int i29 = i22;
                                            i12 = i10;
                                            i13 = i8;
                                            i = i29;
                                            i2 = iM10326a;
                                            while (i13 < dg2Var2.f35588b) {
                                                i13++;
                                                i12++;
                                            }
                                            iArr[i9 + i] = i13;
                                            if (i25 != 0) {
                                                i15 = iM10327b - i9;
                                                i14 = i25;
                                                if (i15 < i26 + 1) {
                                                    continue;
                                                }
                                            } else {
                                                i14 = i25;
                                            }
                                            i27 = i9 + 2;
                                            obj2 = obj;
                                            i22 = i;
                                            iM10326a = i2;
                                            i25 = i14;
                                        } else {
                                            obj = obj2;
                                        }
                                        i7 = iArr[i27 + 1 + i22];
                                        i8 = i7;
                                        i9 = i27;
                                        i10 = ((i8 - dg2Var2.f35587a) + dg2Var2.f35589c) - i9;
                                        if (i24 == 0) {
                                            i11 = i10;
                                        } else {
                                            i11 = i10;
                                        }
                                        int i210 = i22;
                                        i12 = i10;
                                        i13 = i8;
                                        i = i210;
                                        i2 = iM10326a;
                                        while (i13 < dg2Var2.f35588b) {
                                            i13++;
                                            i12++;
                                        }
                                        iArr[i9 + i] = i13;
                                        if (i25 != 0) {
                                            i15 = iM10327b - i9;
                                            i14 = i25;
                                            if (i15 < i26 + 1) {
                                                continue;
                                            }
                                        } else {
                                            i14 = i25;
                                        }
                                        i27 = i9 + 2;
                                        obj2 = obj;
                                        i22 = i;
                                        iM10326a = i2;
                                        i25 = i14;
                                    } else {
                                        obj = obj2;
                                        i = i22;
                                        i2 = iM10326a;
                                        eg2Var = null;
                                    }
                                }
                                if (eg2Var == null) {
                                    boolean z = (dg2Var2.m10327b() - dg2Var2.m10326a()) % 2 == 0;
                                    int iM10327b2 = dg2Var2.m10327b() - dg2Var2.m10326a();
                                    int i30 = i26;
                                    while (true) {
                                        if (i30 <= i24) {
                                            if (i30 == i26 || (i30 != i24 && iArr2[i30 + 1 + i] < iArr2[(i30 - 1) + i])) {
                                                i3 = iArr2[i30 + 1 + i];
                                                i4 = i3;
                                            } else {
                                                i3 = iArr2[(i30 - 1) + i];
                                                i4 = i3 - 1;
                                            }
                                            boolean z2 = z;
                                            int i31 = dg2Var2.f35590d - ((dg2Var2.f35588b - i4) - i30);
                                            int i32 = (i24 == 0 || i4 != i3) ? i31 : i31 + 1;
                                            int i33 = iM10327b2;
                                            while (true) {
                                                if (i4 <= dg2Var2.f35587a || i31 <= dg2Var2.f35589c) {
                                                    i5 = i30;
                                                } else {
                                                    i5 = i30;
                                                    if (vj6Var.m23344p(i4 - 1, i31 - 1)) {
                                                        i4--;
                                                        i31--;
                                                        i30 = i5;
                                                    }
                                                }
                                            }
                                            iArr2[i5 + i] = i4;
                                            if (!z2 || (i6 = i33 - i5) < i26 || i6 > i24 || iArr[i6 + i] < i4) {
                                                i30 = i5 + 2;
                                                z = z2;
                                                iM10327b2 = i33;
                                            } else {
                                                eg2 eg2Var2 = new eg2();
                                                eg2Var2.f37201a = i4;
                                                eg2Var2.f37202b = i31;
                                                eg2Var2.f37203c = i3;
                                                eg2Var2.f37204d = i32;
                                                eg2Var2.f37205e = true;
                                                eg2Var = eg2Var2;
                                            }
                                        } else {
                                            eg2Var = null;
                                        }
                                    }
                                    if (eg2Var == null) {
                                        i24++;
                                        obj2 = obj;
                                        i22 = i;
                                        iM10326a = i2;
                                        i17 = 0;
                                        i20 = 1;
                                    }
                                }
                            } else {
                                obj = obj2;
                                i = i22;
                                eg2Var = null;
                            }
                        }
                    }
                    if (eg2Var != null) {
                        if (eg2Var.m11098a() > 0) {
                            int i34 = eg2Var.f37204d;
                            int i35 = eg2Var.f37202b;
                            int i36 = i34 - i35;
                            int i37 = eg2Var.f37203c;
                            int i38 = eg2Var.f37201a;
                            int i39 = i37 - i38;
                            if (i36 == i39) {
                                ag2Var = new ag2(i38, i35, i39);
                            } else if (eg2Var.f37205e) {
                                ag2Var = new ag2(i38, i35, eg2Var.m11098a());
                            } else {
                                ag2Var = i36 > i39 ? new ag2(i38, i35 + 1, eg2Var.m11098a()) : new ag2(i38 + 1, i35, eg2Var.m11098a());
                            }
                            arrayList.add(ag2Var);
                        }
                        dg2 dg2Var3 = arrayList3.isEmpty() ? new dg2() : (dg2) arrayList3.remove(arrayList3.size() - 1);
                        dg2Var3.f35587a = dg2Var2.f35587a;
                        dg2Var3.f35589c = dg2Var2.f35589c;
                        dg2Var3.f35588b = eg2Var.f37201a;
                        dg2Var3.f35590d = eg2Var.f37202b;
                        arrayList2.add(dg2Var3);
                        dg2Var2.f35588b = dg2Var2.f35588b;
                        dg2Var2.f35590d = dg2Var2.f35590d;
                        dg2Var2.f35587a = eg2Var.f37203c;
                        dg2Var2.f35589c = eg2Var.f37204d;
                        arrayList2.add(dg2Var2);
                    } else {
                        arrayList3.add(dg2Var2);
                    }
                    obj2 = obj;
                    i22 = i;
                    i17 = 0;
                    i20 = 1;
                }
                Collections.sort(arrayList, stc.f61404a);
                ((C3663uw) obj2).f64451c.execute(new gvb(this, new bg2(vj6Var, arrayList, iArr, iArr2), false, 1));
                return;
            case 1:
                Intent intent = (Intent) obj3;
                bec becVar = (bec) obj4;
                if (i18 == -1 && intent != null) {
                    try {
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("uri_array_extra_result_image_uris");
                        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("string_array_extra_result_image_hashes");
                        Uri uri2 = (Uri) intent.getParcelableExtra("uri_extra_result_pdf_uri");
                        int intExtra = intent.getIntExtra("int_extra_result_page_count", 0);
                        ArrayList arrayList4 = new ArrayList();
                        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                            int size3 = parcelableArrayListExtra.size();
                            while (true) {
                                if (i17 < size3) {
                                    Uri uriM3674b2 = becVar.m3674b((Uri) parcelableArrayListExtra.get(i17), ".jpg");
                                    if (uriM3674b2 != null) {
                                        arrayList4.add(uriM3674b2);
                                        i17++;
                                    }
                                } else if (uri2 == null) {
                                    gmsDocumentScanningResultM6773c = GmsDocumentScanningResult.m6773c(arrayList4, stringArrayListExtra, uri, intExtra);
                                } else {
                                    uriM3674b = becVar.m3674b(uri2, ".pdf");
                                    if (uriM3674b == null) {
                                        uri = uriM3674b;
                                        gmsDocumentScanningResultM6773c = GmsDocumentScanningResult.m6773c(arrayList4, stringArrayListExtra, uri, intExtra);
                                    }
                                }
                            }
                        } else if (uri2 == null) {
                            gmsDocumentScanningResultM6773c = GmsDocumentScanningResult.m6773c(arrayList4, stringArrayListExtra, uri, intExtra);
                        } else {
                            uriM3674b = becVar.m3674b(uri2, ".pdf");
                            if (uriM3674b == null) {
                                uri = uriM3674b;
                                gmsDocumentScanningResultM6773c = GmsDocumentScanningResult.m6773c(arrayList4, stringArrayListExtra, uri, intExtra);
                            }
                        }
                    } finally {
                        if (intent != null) {
                            becVar.m3673a(intent.getStringExtra("string_extra_session_id"));
                        }
                    }
                }
                wr9 wr9Var = (wr9) obj2;
                if (gmsDocumentScanningResultM6773c == null) {
                    wr9Var.m24137a(new IllegalStateException("Failed to handle result"));
                } else {
                    wr9Var.m24138b(gmsDocumentScanningResultM6773c);
                }
                if (intent != null) {
                    return;
                } else {
                    return;
                }
            case 2:
                ((cyc) obj4).f34719c.mo16998d(i18, (Exception) obj3, (byte[]) obj2);
                return;
            default:
                xcc xccVar = (xcc) obj3;
                Intent intent2 = (Intent) obj2;
                Service service = (Service) ((nr9) obj4).f53173a;
                i5d i5dVar = (i5d) service;
                if (i5dVar.mo5840a(i18)) {
                    xccVar.f68076I.m17924b(Integer.valueOf(i18), "Local AppMeasurementService processed last upload request. StartId");
                    xcc xccVar2 = kjc.m15281r(service, null, null, null).f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68076I.m17923a("Completed wakeful intent.");
                    i5dVar.mo5841b(intent2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC3626tw(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f62971a = i2;
        this.f62973c = obj;
        this.f62972b = i;
        this.f62974d = obj2;
        this.f62975e = obj3;
    }

    public RunnableC3626tw(C3663uw c3663uw, List list, List list2, int i) {
        this.f62971a = 0;
        this.f62975e = c3663uw;
        this.f62973c = list;
        this.f62974d = list2;
        this.f62972b = i;
    }
}
