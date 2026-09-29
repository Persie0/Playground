package p000;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.internal.zab;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class vf9 implements xf9, yr6, InterfaceC3396o4, a58, txc {

    /* JADX INFO: renamed from: a */
    public Object f65323a;

    public /* synthetic */ vf9(Object obj) {
        this.f65323a = obj;
    }

    @Override // p000.xf9
    /* JADX INFO: renamed from: a */
    public Iterator mo10172a(kg0 kg0Var, CharSequence charSequence) {
        return new uf9(this, kg0Var, charSequence, 0);
    }

    @Override // p000.a58
    public void accept(Object obj, Object obj2) {
        wr9 wr9Var = (wr9) obj2;
        rdb rdbVar = (rdb) ((pcb) obj).m11611l();
        zab zabVar = (zab) this.f65323a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(rdbVar.f51090h);
        zcb.m25555b(parcelObtain, zabVar);
        try {
            rdbVar.f51089g.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            wr9Var.m24138b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // p000.InterfaceC3396o4
    /* JADX INFO: renamed from: b */
    public boolean mo4797b(View view) {
        C3329mb c3329mb = (C3329mb) this.f65323a;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) c3329mb.f50863e;
        if (viewPager2.f7115M) {
            viewPager2.m2893d(currentItem, true);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // p000.txc
    /* JADX INFO: renamed from: d */
    public void mo16998d(int i, Throwable th, byte[] bArr) {
        xcc xccVar;
        xcc xccVar2;
        int i2 = i;
        kjc kjcVar = (kjc) this.f65323a;
        xcc xccVar3 = kjcVar.f47438f;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                qfc qfcVar = kjcVar.f47437e;
                kjc.m15278j(qfcVar);
                qfcVar.f57719O.m22720b(true);
                if (bArr != null || bArr.length == 0) {
                    kjc.m15280l(xccVar3);
                    xccVar3.f68075H.m17923a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        kjc.m15280l(xccVar3);
                        xccVar3.f68075H.m17923a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    rad radVar = kjcVar.f47441i;
                    kjc.m15278j(radVar);
                    kjc kjcVar2 = (kjc) radVar.f60774a;
                    if (TextUtils.isEmpty(strOptString)) {
                        xccVar2 = xccVar3;
                    } else {
                        Context context = kjcVar2.f47433a;
                        xccVar2 = xccVar3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                kjcVar.f47414H.m5854K("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = kjcVar2.f47433a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    xcc xccVar4 = ((kjc) radVar.f60774a).f47438f;
                                    kjc.m15280l(xccVar4);
                                    xccVar4.f68080f.m17924b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            xccVar = xccVar2;
                            kjc.m15280l(xccVar);
                            xccVar.f68080f.m17924b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    kjc.m15280l(xccVar2);
                    xccVar = xccVar2;
                    try {
                        xccVar.f68083i.m17926d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        kjc.m15280l(xccVar);
                        xccVar.f68080f.m17924b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    xccVar = xccVar3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                qfc qfcVar2 = kjcVar.f47437e;
                kjc.m15278j(qfcVar2);
                qfcVar2.f57719O.m22720b(true);
                if (bArr != null) {
                }
                kjc.m15280l(xccVar3);
                xccVar3.f68075H.m17923a("Deferred Deep Link response empty.");
                return;
            }
        }
        kjc.m15280l(xccVar3);
        xccVar3.f68083i.m17925c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        ((jk8) this.f65323a).resumeWith(new Result.Failure(exc));
    }
}
