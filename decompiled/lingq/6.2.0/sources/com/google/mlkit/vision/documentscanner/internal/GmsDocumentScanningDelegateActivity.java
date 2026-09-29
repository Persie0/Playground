package com.google.mlkit.vision.documentscanner.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_document_scanner.C0969a;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmx;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmy;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznt;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzx;
import java.util.ArrayList;
import java.util.Arrays;
import p000.AbstractC3102i7;
import p000.C3028g7;
import p000.C3329mb;
import p000.C3386nv;
import p000.b3d;
import p000.bwb;
import p000.ca1;
import p000.cdb;
import p000.ekd;
import p000.g06;
import p000.i3d;
import p000.j9d;
import p000.jkd;
import p000.uc1;

/* JADX INFO: loaded from: classes2.dex */
public class GmsDocumentScanningDelegateActivity extends uc1 {

    /* JADX INFO: renamed from: Q */
    public final C0969a f13910Q = jkd.m14530c();

    /* JADX INFO: renamed from: R */
    public final ekd f13911R = new ekd(g06.m12269c().m12272b(), 0);

    /* JADX INFO: renamed from: S */
    public i3d f13912S;

    /* JADX INFO: renamed from: T */
    public long f13913T;

    /* JADX INFO: renamed from: U */
    public long f13914U;

    /* JADX INFO: renamed from: j */
    public static Intent m6778j(Context context, Intent intent) {
        Intent action = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        return action.putExtra("string_extra_calling_app_name", i != 0 ? context.getString(i) : context.getPackageManager().getApplicationLabel(applicationInfo).toString()).putExtras(intent).setFlags(1);
    }

    /* JADX INFO: renamed from: k */
    public final void m6779k() {
        setResult(0);
        m6780l(zznt.CANCELLED, 0);
        finish();
    }

    /* JADX INFO: renamed from: l */
    public final void m6780l(zznt zzntVar, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ca1 ca1Var = new ca1();
        C3329mb c3329mb = new C3329mb(20, false);
        c3329mb.f50861c = Long.valueOf((jElapsedRealtime - this.f13913T) & Long.MAX_VALUE);
        c3329mb.f50862d = zzntVar;
        c3329mb.f50863e = this.f13912S;
        c3329mb.f50860b = Integer.valueOf(i & Integer.MAX_VALUE);
        ca1Var.f9784d = new j9d(c3329mb);
        this.f13910Q.m5463a(new cdb(ca1Var), zznu.ON_DEVICE_DOCUMENT_SCANNER_UI_FINISH);
        this.f13911R.m11214a(zzntVar.zza(), this.f13914U, jCurrentTimeMillis);
    }

    @Override // p000.uc1, p000.tc1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        zzmx zzmxVar;
        int i;
        zzmy zzmyVar;
        int i2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        b3d b3dVar = new b3d();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("uri_array_extra_initial_image_uris");
        if (parcelableArrayListExtra != null) {
            b3dVar.f7885a = Integer.valueOf(parcelableArrayListExtra.size() & Integer.MAX_VALUE);
        }
        int intExtra = intent.getIntExtra("int_extra_default_capture_mode", -1);
        int i3 = 1;
        if (intExtra != 1) {
            zzmxVar = intExtra != 2 ? zzmx.MODE_UNKNOWN : zzmx.MODE_MANUAL;
        } else {
            zzmxVar = zzmx.MODE_AUTO;
        }
        b3dVar.f7886b = zzmxVar;
        boolean z = false;
        b3dVar.f7887c = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_flash_mode_change_allowed", false));
        b3dVar.f7888d = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_gallery_import_allowed", false));
        b3dVar.f7897m = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_gallery_import_auto_transform", false));
        b3dVar.f7889e = Boolean.valueOf(intent.getIntExtra("int_extra_page_limit_max", -1) != 1);
        b3dVar.f7896l = Integer.valueOf(intent.getIntExtra("int_extra_page_limit_max", -1));
        b3dVar.f7895k = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_all_new_features_by_default", false));
        b3dVar.f7890f = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_filter_allowed", false));
        b3dVar.f7893i = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_shadow_removal_allowed", false));
        b3dVar.f7894j = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_stain_removal_allowed", false));
        b3dVar.f7898n = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_compute_hash_for_gallery_image", false));
        b3dVar.f7899o = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_auto_enhancements", false));
        Object[] objArrCopyOf = new Object[4];
        int[] intArrayExtra = intent.getIntArrayExtra("int_array_extra_result_formats");
        if (intArrayExtra != null) {
            int i4 = 0;
            i = 0;
            while (i4 < intArrayExtra.length) {
                int i5 = intArrayExtra[i4];
                if (i5 != 101) {
                    zzmyVar = i5 != 102 ? zzmy.FORMAT_UNKNOWN : zzmy.FORMAT_PDF;
                } else {
                    zzmyVar = zzmy.FORMAT_JPEG;
                }
                zzmyVar.getClass();
                int length = objArrCopyOf.length;
                int i6 = i + 1;
                if (i6 < 0) {
                    C3386nv.m17626m("cannot store more than Integer.MAX_VALUE elements");
                    return;
                }
                if (i6 <= length) {
                    i2 = length;
                } else {
                    i2 = (length >> 1) + length + 1;
                    if (i2 < i6) {
                        int iHighestOneBit = Integer.highestOneBit(i);
                        i2 = iHighestOneBit + iHighestOneBit;
                    }
                    if (i2 < 0) {
                        i2 = Integer.MAX_VALUE;
                    }
                }
                if (i2 > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                }
                objArrCopyOf[i] = zzmyVar;
                i4++;
                i = i6;
            }
        } else {
            i = 0;
        }
        b3dVar.f7891g = zzx.m5469j(objArrCopyOf, i);
        b3dVar.f7892h = Boolean.valueOf(intent.getBooleanExtra("boolean_extra_page_edit_listener_enabled", false));
        this.f13912S = new i3d(b3dVar);
        AbstractC3102i7 abstractC3102i7M22671i = m22671i(new bwb(this), new C3028g7(i3));
        if (bundle != null) {
            this.f13913T = bundle.getLong("elapsedStartTimeMsKey");
            this.f13914U = bundle.getLong("epochStartTimeMsKey");
            return;
        }
        this.f13913T = SystemClock.elapsedRealtime();
        this.f13914U = System.currentTimeMillis();
        ca1 ca1Var = new ca1();
        C3329mb c3329mb = new C3329mb(20, z);
        c3329mb.f50863e = this.f13912S;
        ca1Var.f9783c = new j9d(c3329mb);
        this.f13910Q.m5463a(new cdb(ca1Var), zznu.ON_DEVICE_DOCUMENT_SCANNER_UI_START);
        abstractC3102i7M22671i.mo276a(m6778j(this, getIntent()));
    }

    @Override // p000.uc1, p000.tc1, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("elapsedStartTimeMsKey", this.f13913T);
        bundle.putLong("epochStartTimeMsKey", this.f13914U);
    }
}
