package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.webkit.WebSettings;
import androidx.compose.material3.C0253l;
import androidx.work.impl.C0778d;
import androidx.work.impl.foreground.SystemForegroundService;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.data.repository.C1306v;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.domain.C1907d;
import com.lingq.feature.chat.domain.C1999d;
import com.lingq.feature.lessoninfo.PlaylistButtonState;
import com.pierfrancescosoffritti.androidyoutubeplayer.R$raw;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.flow.AbstractC3224d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g91 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f40412c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f40413d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f40414e;

    public /* synthetic */ g91(vi3 vi3Var, f35 f35Var, vi3 vi3Var2, c55 c55Var) {
        this.f40410a = 9;
        this.f40411b = vi3Var;
        this.f40414e = f35Var;
        this.f40412c = vi3Var2;
        this.f40413d = c55Var;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02ab */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo0a() throws JSONException, IOException {
        boolean z = false;
        switch (this.f40410a) {
            case 0:
                q91 q91Var = (q91) this.f40414e;
                vi3 vi3Var = (vi3) this.f40411b;
                t66 t66Var = (t66) this.f40412c;
                uc9 uc9Var = (uc9) this.f40413d;
                if (!q91Var.f57441c && !((Boolean) t66Var.getValue()).booleanValue()) {
                    uc9Var.m22674i(SystemClock.elapsedRealtime());
                    t66Var.setValue(Boolean.TRUE);
                    vi3Var.invoke(v51.f64879a);
                }
                return xfa.f68157a;
            case 1:
                a13 a13Var = (a13) this.f40414e;
                vi3 vi3Var2 = (vi3) this.f40411b;
                t66 t66Var2 = (t66) this.f40412c;
                uc9 uc9Var2 = (uc9) this.f40413d;
                if (!a13Var.f59c && !((Boolean) t66Var2.getValue()).booleanValue()) {
                    uc9Var2.m22674i(SystemClock.elapsedRealtime());
                    t66Var2.setValue(Boolean.TRUE);
                    vi3Var2.invoke(k03.f46469a);
                }
                return xfa.f68157a;
            case 2:
                g77 g77Var = (g77) this.f40414e;
                vi3 vi3Var3 = (vi3) this.f40411b;
                vi3 vi3Var4 = (vi3) this.f40413d;
                t66 t66Var3 = (t66) this.f40412c;
                if (Build.VERSION.SDK_INT >= 33) {
                    t66Var3.setValue(Boolean.TRUE);
                    g77Var.mo12409o();
                } else {
                    vi3Var3.invoke(eh3.f37254a);
                    vi3Var4.invoke(sh3.f60862a);
                }
                return xfa.f68157a;
            case 3:
                C1999d c1999d = (C1999d) this.f40414e;
                String str = (String) this.f40411b;
                String str2 = (String) this.f40412c;
                String str3 = (String) this.f40413d;
                C1289e c1289e = (C1289e) c1999d.f25215b;
                c1289e.getClass();
                str.getClass();
                str2.getClass();
                str3.getClass();
                C1315c c1315c = c1289e.f16467a;
                c1315c.getClass();
                return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1315c.f17001K, false, new String[]{"ChatHistoryEntity", "SearchChatHistoryJoin"}, new md0(str3, 8, str)));
            case 4:
                return ((C1306v) ((C1907d) this.f40414e).f23861a).m7381g((String) this.f40411b, (String) this.f40412c, (String) this.f40413d);
            case 5:
                bj3 bj3Var = (bj3) this.f40414e;
                q7b q7bVar = (q7b) this.f40411b;
                List list = (List) this.f40413d;
                aq4 aq4Var = (aq4) ((t66) this.f40412c).getValue();
                if (aq4Var != null) {
                    bj3Var.mo825e(q7bVar.f57357a, q7bVar.f57358b ? TokenType.CardType : TokenType.WordType, Boolean.FALSE, cfd.m4632g(list, aq4Var));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                Map map = (Map) this.f40414e;
                cd9 cd9Var = (cd9) this.f40411b;
                Map map2 = (Map) this.f40412c;
                cd9 cd9Var2 = (cd9) this.f40413d;
                for (Map.Entry entry : map.entrySet()) {
                    cd9Var.put(Integer.valueOf(((Number) entry.getKey()).intValue()), (List) entry.getValue());
                }
                Iterator it = u91.m22622n1(cd9Var.f9942c).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!map.containsKey(Integer.valueOf(iIntValue))) {
                        cd9Var.remove(Integer.valueOf(iIntValue));
                    }
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    cd9Var2.put(Integer.valueOf(((Number) entry2.getKey()).intValue()), (List) entry2.getValue());
                }
                Iterator it2 = u91.m22622n1(cd9Var2.f9942c).iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = ((Number) it2.next()).intValue();
                    if (!map2.containsKey(Integer.valueOf(iIntValue2))) {
                        cd9Var2.remove(Integer.valueOf(iIntValue2));
                    }
                }
                return xfa.f68157a;
            case 7:
                jm4 jm4Var = (jm4) this.f40414e;
                vi3 vi3Var5 = (vi3) this.f40411b;
                t66 t66Var4 = (t66) this.f40412c;
                t66 t66Var5 = (t66) this.f40413d;
                int i = km4.f47511a[jm4Var.f45824b.ordinal()];
                if (i == 1) {
                    Double dM3869O = bl9.m3869O((String) t66Var4.getValue());
                    double dDoubleValue = dM3869O != null ? dM3869O.doubleValue() : 0.0d;
                    Double dM3869O2 = bl9.m3869O((String) t66Var5.getValue());
                    vi3Var5.invoke(Double.valueOf(((dM3869O2 != null ? dM3869O2.doubleValue() : 0.0d) / 60.0d) + dDoubleValue));
                } else {
                    if (i != 2) {
                        gm5.m12750e();
                        return null;
                    }
                    Double dM3869O3 = bl9.m3869O((String) t66Var4.getValue());
                    vi3Var5.invoke(Double.valueOf(dM3869O3 != null ? dM3869O3.doubleValue() : 0.0d));
                }
                return xfa.f68157a;
            case 8:
                ex4 ex4Var = (ex4) this.f40414e;
                vj6 vj6Var = (vj6) this.f40411b;
                String str4 = (String) this.f40412c;
                AbstractC2949e2 abstractC2949e2 = (AbstractC2949e2) this.f40413d;
                r3b r3bVar = ex4Var.f38034a;
                C3741x c3741x = new C3741x(abstractC2949e2, 29);
                r3bVar.getClass();
                r3bVar.f58580d = c3741x;
                WebSettings settings = r3bVar.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setCacheMode(-1);
                r3bVar.addJavascriptInterface(r3bVar.f58582f, "YouTubePlayerBridge");
                r3bVar.addJavascriptInterface(r3bVar.f58578b, "YouTubePlayerCallbacks");
                InputStream inputStreamOpenRawResource = r3bVar.getResources().openRawResource(R$raw.ayp_youtube_player);
                inputStreamOpenRawResource.getClass();
                try {
                    String strM22596N0 = u91.m22596N0(bq1.m4065r0(new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "utf-8"))), "\n", null, null, null, 62);
                    inputStreamOpenRawResource.close();
                    String strM4839V = cl9.m4839V(cl9.m4839V(strM22596N0, "<<injectedVideoId>>", str4 != null ? ux5.m22986i('\'', "'", str4) : "undefined"), "<<injectedPlayerVars>>", vj6Var.toString());
                    String string = ((JSONObject) vj6Var.f65506b).getString("origin");
                    string.getClass();
                    r3bVar.loadDataWithBaseURL(string, strM4839V, "text/html", "utf-8", null);
                    r3bVar.setWebChromeClient(new rc4(r3bVar));
                    return xfa.f68157a;
                } catch (Exception unused) {
                    throw new RuntimeException("Can't parse HTML file.");
                }
            case 9:
                vi3 vi3Var6 = (vi3) this.f40411b;
                f35 f35Var = (f35) this.f40414e;
                vi3 vi3Var7 = (vi3) this.f40412c;
                c55 c55Var = (c55) this.f40413d;
                lk0 lk0Var = f35Var.f38341a;
                vi3Var6.invoke(new g45(lk0Var.f49754b, lk0Var.f49756d));
                vi3Var7.invoke(new o35(c55Var));
                return xfa.f68157a;
            case 10:
                v35 v35Var = (v35) this.f40414e;
                vi3 vi3Var8 = (vi3) this.f40411b;
                int i2 = ((c35) this.f40412c).f9390a;
                vi3 vi3Var9 = (vi3) this.f40413d;
                int i3 = d45.f34991a[(v35Var.f64787e.f63312a > 0 ? PlaylistButtonState.Remove : PlaylistButtonState.Add).ordinal()];
                if (i3 == 1) {
                    vi3Var8.invoke(new k35(i2));
                } else {
                    if (i3 != 2) {
                        gm5.m12750e();
                        return null;
                    }
                    if (v35Var.f64787e.f63312a == 1) {
                        vi3Var9.invoke(n45.f52319a);
                    } else {
                        vi3Var8.invoke(new q35(i2));
                    }
                }
                return xfa.f68157a;
            case 11:
                v35 v35Var2 = (v35) this.f40414e;
                vi3 vi3Var10 = (vi3) this.f40411b;
                c55 c55Var2 = (c55) this.f40412c;
                vi3 vi3Var11 = (vi3) this.f40413d;
                int i4 = d45.f34992b[gjd.m12716a(v35Var2).ordinal()];
                if (i4 == 1 || i4 == 2) {
                    vi3Var10.invoke(new o35(c55Var2));
                } else {
                    if (i4 != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var11.invoke(p45.f55566a);
                }
                return xfa.f68157a;
            case 12:
                C0253l c0253l = (C0253l) this.f40414e;
                fb2 fb2Var = (fb2) this.f40411b;
                l43 l43Var = (l43) this.f40412c;
                l43 l43Var2 = (l43) this.f40413d;
                ((xc9) c0253l.f3553c).setValue(fb2Var);
                c0253l.f3554d = l43Var;
                c0253l.f3555e = l43Var2;
                return xfa.f68157a;
            case 13:
                fm7 fm7Var = (fm7) this.f40414e;
                ui3 ui3Var = (ui3) this.f40411b;
                ui3 ui3Var2 = (ui3) this.f40413d;
                t66 t66Var6 = (t66) this.f40412c;
                if (fm7Var.f39290d) {
                    t66Var6.setValue(Boolean.TRUE);
                    ui3Var.mo0a();
                } else {
                    ui3Var2.mo0a();
                }
                return xfa.f68157a;
            case 14:
                xs8 xs8Var = (xs8) this.f40414e;
                vi3 vi3Var12 = (vi3) this.f40411b;
                t66 t66Var7 = (t66) this.f40412c;
                uc9 uc9Var3 = (uc9) this.f40413d;
                if (!xs8Var.f68654c && !((Boolean) t66Var7.getValue()).booleanValue()) {
                    uc9Var3.m22674i(SystemClock.elapsedRealtime());
                    t66Var7.setValue(Boolean.TRUE);
                    vi3Var12.invoke(vr8.f65829a);
                }
                return xfa.f68157a;
            case 15:
                C1909e c1909e = (C1909e) this.f40414e;
                String str5 = (String) this.f40411b;
                String str6 = (String) this.f40412c;
                TokenPopupData tokenPopupData = (TokenPopupData) this.f40413d;
                C1909e.m8730V2(c1909e, str5, str6, tokenPopupData.f23446b, tokenPopupData.f23443Q);
                return xfa.f68157a;
            default:
                z7b z7bVar = (z7b) this.f40414e;
                UUID uuid = (UUID) this.f40411b;
                gc3 gc3Var = (gc3) this.f40412c;
                Context context = (Context) this.f40413d;
                String string2 = uuid.toString();
                p8b p8bVarM22569e = z7bVar.f71037c.m22569e(string2);
                if (p8bVarM22569e == null || p8bVarM22569e.f55773b.isFinished()) {
                    C3386nv.m17633t("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    il7 il7Var = z7bVar.f71036b;
                    synchronized (il7Var.f44277k) {
                        try {
                            oj5.m18040f().m18045g(il7.f44266l, "Moving WorkSpec (" + string2 + ") to the foreground");
                            C0778d c0778d = (C0778d) il7Var.f44273g.remove(string2);
                            if (c0778d != null) {
                                if (il7Var.f44267a == null) {
                                    PowerManager.WakeLock wakeLockM10811a = e2b.m10811a(il7Var.f44268b);
                                    il7Var.f44267a = wakeLockM10811a;
                                    wakeLockM10811a.acquire();
                                }
                                il7Var.f44272f.put(string2, c0778d);
                                il7Var.f44268b.startForegroundService(op9.m18196c(il7Var.f44268b, acd.m270b(c0778d.f7240a), gc3Var));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    a8b a8bVarM270b = acd.m270b(p8bVarM22569e);
                    String str7 = op9.f54693j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", gc3Var.f40525a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gc3Var.f40526b);
                    intent.putExtra("KEY_NOTIFICATION", gc3Var.f40527c);
                    intent.putExtra("KEY_WORKSPEC_ID", a8bVarM270b.f364a);
                    intent.putExtra("KEY_GENERATION", a8bVarM270b.f365b);
                    context.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ g91(C0253l c0253l, fb2 fb2Var, l43 l43Var, l43 l43Var2, l43 l43Var3) {
        this.f40410a = 12;
        this.f40414e = c0253l;
        this.f40411b = fb2Var;
        this.f40412c = l43Var;
        this.f40413d = l43Var2;
    }

    public /* synthetic */ g91(Object obj, Object obj2, Object obj3, t66 t66Var, int i) {
        this.f40410a = i;
        this.f40414e = obj;
        this.f40411b = obj2;
        this.f40413d = obj3;
        this.f40412c = t66Var;
    }

    public /* synthetic */ g91(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f40410a = i;
        this.f40414e = obj;
        this.f40411b = obj2;
        this.f40412c = obj3;
        this.f40413d = obj4;
    }
}
