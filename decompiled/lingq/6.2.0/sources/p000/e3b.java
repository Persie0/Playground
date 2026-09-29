package p000;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e3b extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final String f36663a;

    /* JADX INFO: renamed from: b */
    public final Bundle f36664b;

    /* JADX INFO: renamed from: c */
    public Exception[] f36665c = new Exception[0];

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ g3b f36666d;

    public e3b(g3b g3bVar, String str, Bundle bundle) {
        this.f36666d = g3bVar;
        this.f36663a = str;
        this.f36664b = bundle;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [d3b] */
    /* JADX INFO: renamed from: a */
    public final String[] m10824a(Void... voidArr) {
        if (!lp1.f49971a.contains(this)) {
            try {
                voidArr.getClass();
                String[] stringArray = this.f36664b.getStringArray("media");
                if (stringArray != null) {
                    final String[] strArr = new String[stringArray.length];
                    this.f36665c = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    Date date = AccessToken.f11306l;
                    AccessToken accessTokenM24363t = x74.m24363t();
                    try {
                        int length = stringArray.length;
                        for (final int i = 0; i < length; i++) {
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((np3) it.next()).cancel(true);
                                }
                            } else {
                                Uri uri = Uri.parse(stringArray[i]);
                                if (bna.m3947e0(uri)) {
                                    strArr[i] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    ?? r9 = new kp3() { // from class: d3b
                                        @Override // p000.kp3
                                        /* JADX INFO: renamed from: a */
                                        public final void mo3204a(pp3 pp3Var) {
                                            String[] strArr2 = strArr;
                                            int i2 = i;
                                            try {
                                                FacebookRequestError facebookRequestError = pp3Var.f56629c;
                                                String str = "Error staging photo.";
                                                if (facebookRequestError != null) {
                                                    String strM5184a = facebookRequestError.m5184a();
                                                    if (strM5184a != null) {
                                                        str = strM5184a;
                                                    }
                                                    throw new FacebookGraphResponseException(pp3Var, str);
                                                }
                                                JSONObject jSONObject = pp3Var.f56628b;
                                                if (jSONObject == null) {
                                                    throw new FacebookException("Error staging photo.");
                                                }
                                                String strOptString = jSONObject.optString("uri");
                                                if (strOptString == null) {
                                                    throw new FacebookException("Error staging photo.");
                                                }
                                                strArr2[i2] = strOptString;
                                                countDownLatch.countDown();
                                            } catch (Exception e) {
                                                this.f36665c[i2] = e;
                                            }
                                        }
                                    };
                                    uri.getClass();
                                    concurrentLinkedQueue.add(v2d.m23069a(accessTokenM24363t, uri, r9).m16983d());
                                }
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((np3) it2.next()).cancel(true);
                        }
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m10825b(String[] strArr) {
        Bundle bundle = this.f36664b;
        g3b g3bVar = this.f36666d;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            ProgressDialog progressDialog = g3bVar.f40143e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            for (Exception exc : this.f36665c) {
                if (exc != null) {
                    g3bVar.m12347e(exc);
                    return;
                }
            }
            if (strArr == null) {
                g3bVar.m12347e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List listAsList = Arrays.asList(strArr);
            listAsList.getClass();
            if (listAsList.contains(null)) {
                g3bVar.m12347e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            bna.m3966o0(bundle, new JSONArray((Collection) listAsList));
            g3bVar.f40139a = bna.m3956j(AbstractC3695vr.m23503n(), sy2.m21769d() + "/dialog/" + this.f36663a, bundle).toString();
            ImageView imageView = g3bVar.f40144f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            g3bVar.m12348f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            return m10824a((Void[]) objArr);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            m10825b((String[]) obj);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
