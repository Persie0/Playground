package com.lingq.feature.imports;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznt;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity;
import com.lingq.feature.imports.data.UserImportSourceType;
import java.util.Arrays;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3028g7;
import p000.C3065h7;
import p000.C3329mb;
import p000.C3386nv;
import p000.InterfaceC2991f7;
import p000.ad3;
import p000.ca1;
import p000.cdb;
import p000.cs4;
import p000.dl9;
import p000.do3;
import p000.dua;
import p000.dw6;
import p000.eo3;
import p000.eob;
import p000.gfb;
import p000.gr3;
import p000.hwb;
import p000.id3;
import p000.idd;
import p000.j9d;
import p000.lda;
import p000.mka;
import p000.nka;
import p000.or1;
import p000.pka;
import p000.po3;
import p000.pz6;
import p000.rt3;
import p000.sq5;
import p000.tld;
import p000.ui3;
import p000.uq0;
import p000.vk9;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wq1;
import p000.xr9;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class UserImportFragment extends rt3 {

    /* JADX INFO: renamed from: C0 */
    public final w41 f26001C0;

    /* JADX INFO: renamed from: D0 */
    public final sq5 f26002D0;

    /* JADX INFO: renamed from: E0 */
    public ad3 f26003E0;

    /* JADX INFO: renamed from: F0 */
    public ad3 f26004F0;

    /* JADX INFO: renamed from: G0 */
    public w41 f26005G0;

    public UserImportFragment() {
        super(R$layout.fragment_user_import, 21);
        final UserImportFragment$special$$inlined$viewModels$default$1 userImportFragment$special$$inlined$viewModels$default$1 = new UserImportFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.imports.UserImportFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) userImportFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f26001C0 = new w41(y38.m24933a(C2109f.class), new ui3() { // from class: com.lingq.feature.imports.UserImportFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.imports.UserImportFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f26024b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.imports.UserImportFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
        this.f26002D0 = new sq5(3, y38.m24933a(pka.class), new uq0(this, 19));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1790594452, true, new dl9(this, 8)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: B */
    public final void mo2075B() {
        this.f5688b0 = true;
        if (m2089Q().isFinishing() || !m2089Q().isChangingConfigurations()) {
            m8997R0().clear();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        String strM13801a;
        view.getClass();
        vz1.m23640l0(this);
        final int i = 0;
        this.f26004F0 = (ad3) m2088P(new InterfaceC2991f7(this) { // from class: com.lingq.feature.imports.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ UserImportFragment f26150b;

            {
                this.f26150b = this;
            }

            @Override // p000.InterfaceC2991f7
            /* JADX INFO: renamed from: c */
            public final void mo2125c(Object obj) {
                List listMo6774a;
                Intent intent;
                Uri data;
                String strM13801a2;
                int i2 = i;
                UserImportFragment userImportFragment = this.f26150b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        activityResult.getClass();
                        if (activityResult.f1007a == -1) {
                            Intent intent2 = activityResult.f1008b;
                            GmsDocumentScanningResult gmsDocumentScanningResult = intent2 == null ? null : (GmsDocumentScanningResult) intent2.getParcelableExtra("extra_scanning_result");
                            if (gmsDocumentScanningResult != null && (listMo6774a = gmsDocumentScanningResult.mo6774a()) != null) {
                                C2109f c2109fM8997R0 = userImportFragment.m8997R0();
                                ContentResolver contentResolver = userImportFragment.m2089Q().getContentResolver();
                                contentResolver.getClass();
                                c2109fM8997R0.getClass();
                                wfb.m23926u(lda.m16103C(c2109fM8997R0), c2109fM8997R0.f26180l, null, new UserImportViewModel$getContentFromScan$1(c2109fM8997R0, contentResolver, listMo6774a, null), 2);
                                break;
                            }
                        }
                        break;
                    default:
                        activityResult.getClass();
                        if (activityResult.f1007a == -1 && (intent = activityResult.f1008b) != null && (data = intent.getData()) != null) {
                            C2109f c2109fM8997R1 = userImportFragment.m8997R0();
                            ContentResolver contentResolver2 = userImportFragment.m2089Q().getContentResolver();
                            contentResolver2.getClass();
                            Context contextMo2107i = userImportFragment.mo2107i();
                            if (contextMo2107i == null || (strM13801a2 = idd.m13801a(contextMo2107i, data)) == null) {
                                strM13801a2 = "";
                            }
                            String str = strM13801a2;
                            c2109fM8997R1.getClass();
                            wfb.m23926u(lda.m16103C(c2109fM8997R1), c2109fM8997R1.f26180l, null, new UserImportViewModel$updateSelectedFile$1(c2109fM8997R1, contentResolver2, data, str, null), 2);
                            break;
                        }
                        break;
                }
            }
        }, new C3028g7(2));
        final int i2 = 1;
        this.f26003E0 = (ad3) m2088P(new InterfaceC2991f7(this) { // from class: com.lingq.feature.imports.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ UserImportFragment f26150b;

            {
                this.f26150b = this;
            }

            @Override // p000.InterfaceC2991f7
            /* JADX INFO: renamed from: c */
            public final void mo2125c(Object obj) {
                List listMo6774a;
                Intent intent;
                Uri data;
                String strM13801a2;
                int i3 = i2;
                UserImportFragment userImportFragment = this.f26150b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i3) {
                    case 0:
                        activityResult.getClass();
                        if (activityResult.f1007a == -1) {
                            Intent intent2 = activityResult.f1008b;
                            GmsDocumentScanningResult gmsDocumentScanningResult = intent2 == null ? null : (GmsDocumentScanningResult) intent2.getParcelableExtra("extra_scanning_result");
                            if (gmsDocumentScanningResult != null && (listMo6774a = gmsDocumentScanningResult.mo6774a()) != null) {
                                C2109f c2109fM8997R0 = userImportFragment.m8997R0();
                                ContentResolver contentResolver = userImportFragment.m2089Q().getContentResolver();
                                contentResolver.getClass();
                                c2109fM8997R0.getClass();
                                wfb.m23926u(lda.m16103C(c2109fM8997R0), c2109fM8997R0.f26180l, null, new UserImportViewModel$getContentFromScan$1(c2109fM8997R0, contentResolver, listMo6774a, null), 2);
                                break;
                            }
                        }
                        break;
                    default:
                        activityResult.getClass();
                        if (activityResult.f1007a == -1 && (intent = activityResult.f1008b) != null && (data = intent.getData()) != null) {
                            C2109f c2109fM8997R1 = userImportFragment.m8997R0();
                            ContentResolver contentResolver2 = userImportFragment.m2089Q().getContentResolver();
                            contentResolver2.getClass();
                            Context contextMo2107i = userImportFragment.mo2107i();
                            if (contextMo2107i == null || (strM13801a2 = idd.m13801a(contextMo2107i, data)) == null) {
                                strM13801a2 = "";
                            }
                            String str = strM13801a2;
                            c2109fM8997R1.getClass();
                            wfb.m23926u(lda.m16103C(c2109fM8997R1), c2109fM8997R1.f26180l, null, new UserImportViewModel$updateSelectedFile$1(c2109fM8997R1, contentResolver2, data, str, null), 2);
                            break;
                        }
                        break;
                }
            }
        }, new C3028g7(i2));
        m2088P(new mka(this), new C3065h7());
        C2109f c2109fM8997R0 = m8997R0();
        sq5 sq5Var = this.f26002D0;
        UserImportSourceType userImportSourceType = ((pka) sq5Var.getValue()).f56382a;
        c2109fM8997R0.getClass();
        wfb.m23926u(lda.m16103C(c2109fM8997R0), null, null, new UserImportViewModel$initImportData$1(c2109fM8997R0, userImportSourceType, null), 3);
        if (((pka) sq5Var.getValue()).f56382a == UserImportSourceType.File && !vk9.m23391n0(((pka) sq5Var.getValue()).f56385d)) {
            C2109f c2109fM8997R1 = m8997R0();
            ContentResolver contentResolver = m2089Q().getContentResolver();
            contentResolver.getClass();
            Uri uri = Uri.parse(((pka) sq5Var.getValue()).f56385d);
            Context contextMo2107i = mo2107i();
            if (contextMo2107i == null || (strM13801a = idd.m13801a(contextMo2107i, Uri.parse(((pka) sq5Var.getValue()).f56385d))) == null) {
                strM13801a = "";
            }
            String str = strM13801a;
            c2109fM8997R1.getClass();
            uri.getClass();
            wfb.m23926u(lda.m16103C(c2109fM8997R1), c2109fM8997R1.f26180l, null, new UserImportViewModel$updateSelectedFile$1(c2109fM8997R1, contentResolver, uri, str, null), 2);
        }
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2084xbc15db23(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final C2109f m8997R0() {
        return (C2109f) this.f26001C0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x014f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0165  */
    /* JADX WARN: Code duplicated, block: B:34:0x0214  */
    /* JADX WARN: Code duplicated, block: B:37:0x0235  */
    /* JADX WARN: Code duplicated, block: B:38:0x0237  */
    /* JADX WARN: Code duplicated, block: B:40:0x023a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0242 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0245  */
    /* JADX WARN: Code duplicated, block: B:46:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0254  */
    /* JADX WARN: Code duplicated, block: B:51:0x025a  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x02f0  */
    /* JADX INFO: renamed from: S0 */
    public final void m8998S0() {
        int i;
        tld tldVarM5974b;
        Intent intentPutExtra;
        int i2;
        boolean zM13546a;
        boolean z;
        Intent intent;
        PendingIntent activity;
        do3 do3Var = new do3();
        int[] iArrCopyOf = Arrays.copyOf(new int[0], 1);
        do3Var.f35943a = iArrCopyOf;
        iArrCopyOf[0] = 101;
        do3Var.f35944b = true;
        do3Var.f35945c = true;
        do3Var.f35946d = true;
        do3Var.f35947e = true;
        eob eobVar = new eob(new eo3(do3Var));
        id3 id3VarM2089Q = m2089Q();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context applicationContext = id3VarM2089Q.getApplicationContext();
        ca1 ca1Var = new ca1();
        C3329mb c3329mb = new C3329mb(20, false);
        c3329mb.f50863e = eobVar.f37644c;
        ca1Var.f9785e = new j9d(c3329mb);
        eobVar.f37645d.m5463a(new cdb(ca1Var), zznu.ON_DEVICE_DOCUMENT_SCANNER_UI_CREATE);
        ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
        if (activityManager != null) {
            i = 17;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            float f = ((memoryInfo.totalMem / 1024.0f) / 1024.0f) / 1024.0f;
            StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 17);
            sb.append("total RAM (GB) = ");
            sb.append(f);
            String string = sb.toString();
            if (Log.isLoggable("GmsDocumentScannerImpl", 3)) {
                Log.d("GmsDocumentScannerImpl", string);
            }
            if (f < 1.7f) {
                eobVar.m11282b(zznt.LOW_MEMORY, jElapsedRealtime, jCurrentTimeMillis);
                StringBuilder sb2 = new StringBuilder(String.valueOf(1.7f).length() + 65);
                sb2.append("Device RAM is below the minimal requirement for this feature: 1.7 GB");
                tldVarM5974b = Tasks.m5974b(new MlKitException(sb2.toString(), 18));
            }
            if (tldVarM5974b == null) {
                gfb gfbVar = new gfb(2);
                gfbVar.attachInterface(gfbVar, "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerCallbacks");
                Bundle bundle = new Bundle();
                bundle.putBinder("bundle_binder_extra_callbacks", gfbVar);
                Intent intentPutExtra2 = new Intent(id3VarM2089Q, (Class<?>) GmsDocumentScanningDelegateActivity.class).putExtra("boolean_extra_request_uris_in_result_intent", true);
                Intent intentPutExtra3 = new Intent().putParcelableArrayListExtra("uri_array_extra_initial_image_uris", null).putExtra("int_extra_default_capture_mode", 1).putExtra("boolean_extra_flash_mode_change_allowed", true);
                eo3 eo3Var = eobVar.f37642a;
                eo3Var.getClass();
                intentPutExtra = intentPutExtra2.putExtras(intentPutExtra3.putExtra("boolean_extra_gallery_import_allowed", true).putExtra("boolean_extra_enable_gallery_import_auto_transform", true).putExtra("int_extra_page_limit_max", -1).putExtra("boolean_extra_page_edit_listener_enabled", false).putExtra("int_array_extra_result_formats", eo3Var.f37600a).putExtra("boolean_extra_enable_all_new_features_by_default", eo3Var.f37601b).putExtra("boolean_extra_filter_allowed", eo3Var.f37602c).putExtra("boolean_extra_shadow_removal_allowed", eo3Var.f37603d).putExtra("boolean_extra_stain_removal_allowed", eo3Var.f37604e).putExtra("boolean_extra_enable_compute_hash_for_gallery_image", false).putExtra("boolean_extra_enable_auto_enhancements", eo3Var.f37605f).putExtra("string_extra_camera_id", "")).setFlags(1).putExtra("bundle_binder_extra_callbacks", bundle);
                if (applicationContext.getPackageName().equals("com.google.android.gms")) {
                    intentPutExtra = GmsDocumentScanningDelegateActivity.m6778j(applicationContext, intentPutExtra).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.mlkit.docscan.ui.DocumentScanningActivity"));
                }
                i2 = eob.f37641g;
                eob.f37641g = i2 + 1;
                zM13546a = hwb.m13546a(67108864, 67108864);
                if (intentPutExtra.getComponent() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C3386nv.m17626m("Must set component on Intent.");
                    return;
                }
                if (hwb.m13546a(0, 1)) {
                    if (zM13546a) {
                        C3386nv.m17626m("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
                        return;
                    }
                } else if (!zM13546a) {
                    C3386nv.m17626m("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
                    return;
                }
                intent = new Intent(intentPutExtra);
                if (!zM13546a) {
                    if (intent.getPackage() == null) {
                        intent.setPackage(intent.getComponent().getPackageName());
                    }
                    if (!hwb.m13546a(0, 3) && intent.getAction() == null) {
                        intent.setAction("");
                    }
                    if (!hwb.m13546a(0, 9) && intent.getCategories() == null) {
                        intent.addCategory("");
                    }
                    if (!hwb.m13546a(0, 5) && intent.getData() == null) {
                        intent.setDataAndType(Uri.EMPTY, "*/*");
                    }
                    if (!hwb.m13546a(0, i) && intent.getClipData() == null) {
                        intent.setClipData(hwb.f43082a);
                    }
                }
                activity = PendingIntent.getActivity(id3VarM2089Q, i2, intent, 67108864);
                if (activity == null) {
                    eobVar.m11282b(zznt.UNKNOWN_ERROR, jElapsedRealtime, jCurrentTimeMillis);
                    tldVarM5974b = Tasks.m5974b(new MlKitException("Failed to create IntentSender", 13));
                } else {
                    tldVarM5974b = Tasks.m5975c(activity.getIntentSender());
                }
            }
            tldVarM5974b.mo5963e(xr9.f68587a, new dw6(new nka(this, 0), 19));
            tldVarM5974b.mo5961c(new mka(this));
        }
        i = 17;
        if (!eob.f37640f) {
            pz6.m19578b(applicationContext, eobVar.f37643b);
            eob.f37640f = true;
        }
        po3.f56584b.getClass();
        int iM19430a = po3.m19430a(applicationContext);
        String strM24124t = wq1.m24124t(new StringBuilder(String.valueOf(iM19430a).length() + 11), "gmsVersion=", iM19430a);
        if (Log.isLoggable("GmsDocumentScannerImpl", 3)) {
            Log.d("GmsDocumentScannerImpl", strM24124t);
        }
        if (iM19430a < 233900000) {
            eobVar.m11282b(zznt.GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, jElapsedRealtime, jCurrentTimeMillis);
            tldVarM5974b = Tasks.m5974b(new MlKitException("Feature not available in the current version of the Google Play services", 14));
        } else {
            boolean z2 = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT").resolveActivity(applicationContext.getPackageManager()) != null;
            StringBuilder sb3 = new StringBuilder(String.valueOf(z2).length() + 27);
            sb3.append("isDocScanActivityAvailable=");
            sb3.append(z2);
            String string2 = sb3.toString();
            if (Log.isLoggable("GmsDocumentScannerImpl", 3)) {
                Log.d("GmsDocumentScannerImpl", string2);
            }
            if (z2) {
                tldVarM5974b = null;
            } else {
                eobVar.m11282b(zznt.GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, jElapsedRealtime, jCurrentTimeMillis);
                tldVarM5974b = Tasks.m5974b(new MlKitException("Feature not available in the current version of the Google Play services", 14));
            }
        }
        if (tldVarM5974b == null) {
            gfb gfbVar2 = new gfb(2);
            gfbVar2.attachInterface(gfbVar2, "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerCallbacks");
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("bundle_binder_extra_callbacks", gfbVar2);
            Intent intentPutExtra4 = new Intent(id3VarM2089Q, (Class<?>) GmsDocumentScanningDelegateActivity.class).putExtra("boolean_extra_request_uris_in_result_intent", true);
            Intent intentPutExtra5 = new Intent().putParcelableArrayListExtra("uri_array_extra_initial_image_uris", null).putExtra("int_extra_default_capture_mode", 1).putExtra("boolean_extra_flash_mode_change_allowed", true);
            eo3 eo3Var2 = eobVar.f37642a;
            eo3Var2.getClass();
            intentPutExtra = intentPutExtra4.putExtras(intentPutExtra5.putExtra("boolean_extra_gallery_import_allowed", true).putExtra("boolean_extra_enable_gallery_import_auto_transform", true).putExtra("int_extra_page_limit_max", -1).putExtra("boolean_extra_page_edit_listener_enabled", false).putExtra("int_array_extra_result_formats", eo3Var2.f37600a).putExtra("boolean_extra_enable_all_new_features_by_default", eo3Var2.f37601b).putExtra("boolean_extra_filter_allowed", eo3Var2.f37602c).putExtra("boolean_extra_shadow_removal_allowed", eo3Var2.f37603d).putExtra("boolean_extra_stain_removal_allowed", eo3Var2.f37604e).putExtra("boolean_extra_enable_compute_hash_for_gallery_image", false).putExtra("boolean_extra_enable_auto_enhancements", eo3Var2.f37605f).putExtra("string_extra_camera_id", "")).setFlags(1).putExtra("bundle_binder_extra_callbacks", bundle2);
            if (applicationContext.getPackageName().equals("com.google.android.gms")) {
                intentPutExtra = GmsDocumentScanningDelegateActivity.m6778j(applicationContext, intentPutExtra).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.mlkit.docscan.ui.DocumentScanningActivity"));
            }
            i2 = eob.f37641g;
            eob.f37641g = i2 + 1;
            zM13546a = hwb.m13546a(67108864, 67108864);
            if (intentPutExtra.getComponent() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C3386nv.m17626m("Must set component on Intent.");
                return;
            }
            if (hwb.m13546a(0, 1)) {
                if (zM13546a) {
                    C3386nv.m17626m("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
                    return;
                }
            } else if (!zM13546a) {
                C3386nv.m17626m("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
                return;
            }
            intent = new Intent(intentPutExtra);
            if (!zM13546a) {
                if (intent.getPackage() == null) {
                    intent.setPackage(intent.getComponent().getPackageName());
                }
                if (!hwb.m13546a(0, 3)) {
                    intent.setAction("");
                }
                if (!hwb.m13546a(0, 9)) {
                    intent.addCategory("");
                }
                if (!hwb.m13546a(0, 5)) {
                    intent.setDataAndType(Uri.EMPTY, "*/*");
                }
                if (!hwb.m13546a(0, i)) {
                    intent.setClipData(hwb.f43082a);
                }
            }
            activity = PendingIntent.getActivity(id3VarM2089Q, i2, intent, 67108864);
            if (activity == null) {
                eobVar.m11282b(zznt.UNKNOWN_ERROR, jElapsedRealtime, jCurrentTimeMillis);
                tldVarM5974b = Tasks.m5974b(new MlKitException("Failed to create IntentSender", 13));
            } else {
                tldVarM5974b = Tasks.m5975c(activity.getIntentSender());
            }
        }
        tldVarM5974b.mo5963e(xr9.f68587a, new dw6(new nka(this, 0), 19));
        tldVarM5974b.mo5961c(new mka(this));
    }
}
