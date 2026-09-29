package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.mlkit_common.C0966a;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pz6 {

    /* JADX INFO: renamed from: a */
    public static final Feature[] f57041a = new Feature[0];

    /* JADX INFO: renamed from: b */
    public static final Feature f57042b;

    /* JADX INFO: renamed from: c */
    public static final Feature f57043c;

    /* JADX INFO: renamed from: d */
    public static final Feature f57044d;

    /* JADX INFO: renamed from: e */
    public static final Feature f57045e;

    /* JADX INFO: renamed from: f */
    public static final Feature f57046f;

    /* JADX INFO: renamed from: g */
    public static final Feature f57047g;

    /* JADX INFO: renamed from: h */
    public static final Feature f57048h;

    /* JADX INFO: renamed from: i */
    public static final Feature f57049i;

    /* JADX INFO: renamed from: j */
    public static final Feature f57050j;

    /* JADX INFO: renamed from: k */
    public static final zzai f57051k;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        f57042b = feature5;
        f57043c = new Feature("mlkit.ocr.chinese", 1L);
        f57044d = new Feature("mlkit.ocr.common", 1L);
        f57045e = new Feature("mlkit.ocr.devanagari", 1L);
        f57046f = new Feature("mlkit.ocr.japanese", 1L);
        f57047g = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f57048h = new Feature("mlkit.docscan.ui", 1L);
        f57049i = new Feature("mlkit.docscan.stain", 1L);
        f57050j = new Feature("mlkit.docscan.shadow", 1L);
        C0966a c0966a = new C0966a();
        c0966a.m5446a("barcode", feature);
        c0966a.m5446a("custom_ica", feature2);
        c0966a.m5446a("face", feature3);
        c0966a.m5446a("ica", feature4);
        c0966a.m5446a("ocr", feature5);
        c0966a.m5446a("langid", feature6);
        c0966a.m5446a("nlclassifier", feature7);
        c0966a.m5446a("tflite_dynamite", feature8);
        c0966a.m5446a("barcode_ui", feature9);
        c0966a.m5446a("smart_reply", feature10);
        f57051k = c0966a.m5447b();
        C0966a c0966a2 = new C0966a();
        c0966a2.m5446a("com.google.android.gms.vision.barcode", feature);
        c0966a2.m5446a("com.google.android.gms.vision.custom.ica", feature2);
        c0966a2.m5446a("com.google.android.gms.vision.face", feature3);
        c0966a2.m5446a("com.google.android.gms.vision.ica", feature4);
        c0966a2.m5446a("com.google.android.gms.vision.ocr", feature5);
        c0966a2.m5446a("com.google.android.gms.mlkit.langid", feature6);
        c0966a2.m5446a("com.google.android.gms.mlkit.nlclassifier", feature7);
        c0966a2.m5446a("com.google.android.gms.tflite_dynamite", feature8);
        c0966a2.m5446a("com.google.android.gms.mlkit_smartreply", feature10);
        c0966a2.m5447b();
    }

    /* JADX INFO: renamed from: a */
    public static void m19577a(Context context) {
        khb khbVar = zzaf.f11930b;
        Object[] objArr = {"ocr"};
        gka.m12725d(objArr, 1);
        zzaf zzafVarM5453j = zzaf.m5453j(objArr, 1);
        po3.f56584b.getClass();
        if (po3.m19430a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", zzafVarM5453j));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        Feature[] featureArr = new Feature[zzafVarM5453j.size()];
        for (int i = 0; i < zzafVarM5453j.size(); i++) {
            Feature feature = (Feature) f57051k.get(zzafVarM5453j.get(i));
            lda.m16130p(feature);
            featureArr[i] = feature;
        }
        m19578b(context, featureArr);
    }

    /* JADX INFO: renamed from: b */
    public static void m19578b(Context context, final Feature[] featureArr) {
        tld tldVarM17569c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new oz6() { // from class: n6d
            @Override // p000.oz6
            /* JADX INFO: renamed from: a */
            public final Feature[] mo11281a() {
                Feature[] featureArr2 = pz6.f57041a;
                return featureArr;
            }
        });
        lda.m16124j("APIs must not be empty.", !arrayList.isEmpty());
        xdb xdbVar = new xdb(context, xdb.f68109m, InterfaceC3691vn.f65627m, mo3.f51630c);
        TreeSet treeSet = new TreeSet(yd7.f69696c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((oz6) it.next()).mo11281a());
        }
        ApiFeatureRequest apiFeatureRequest = new ApiFeatureRequest(new ArrayList(treeSet), true, null, null);
        boolean z = false;
        if (apiFeatureRequest.f11752a.isEmpty()) {
            tldVarM17569c = Tasks.m5975c(new ModuleInstallResponse(0, false));
        } else {
            i44 i44VarM13651b = i44.m13651b();
            i44VarM13651b.f43483d = new Feature[]{hyc.f43223a};
            i44VarM13651b.f43480a = true;
            i44VarM13651b.f43481b = 27304;
            i44VarM13651b.f43482c = new cdb(xdbVar, apiFeatureRequest, z, 2);
            tldVarM17569c = xdbVar.m17569c(0, i44VarM13651b.m13652a());
        }
        tldVarM17569c.mo5961c(new j13());
    }
}
