package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.exoplayer.source.C0717b;
import com.facebook.AccessToken;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$EventType;
import com.google.android.datatransport.Priority;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackQuality;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mv5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f51885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f51886c;

    public /* synthetic */ mv5(sg3 sg3Var, ArrayList arrayList, StorageQueueChangedAction storageQueueChangedAction) {
        this.f51884a = 10;
        this.f51885b = arrayList;
        this.f51886c = storageQueueChangedAction;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        String string = null;
        int i = 1;
        boolean z = false;
        z = false;
        switch (this.f51884a) {
            case 0:
                ((kk1) this.f51885b).accept((ov5) this.f51886c);
                return;
            case 1:
                View view = (View) this.f51885b;
                qy5 qy5Var = (qy5) this.f51886c;
                if (lp1.f49971a.contains(qy5.class)) {
                    return;
                }
                try {
                    if (view instanceof EditText) {
                        qy5Var.m20198b(view);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    lp1.m16420a(qy5.class, th);
                    return;
                }
            case 2:
                String str = (String) this.f51885b;
                AppEvent appEvent = (AppEvent) this.f51886c;
                Set set = lp1.f49971a;
                if (set.contains(xr6.class)) {
                    return;
                }
                try {
                    List listM23604J = vz1.m23604J(appEvent);
                    p58 p58Var = p58.f55608b;
                    if (set.contains(p58.class)) {
                        return;
                    }
                    try {
                        p58.f55608b.m18911q(RemoteServiceWrapper$EventType.CUSTOM_APP_EVENTS, str, listM23604J);
                        return;
                    } catch (Throwable th2) {
                        lp1.m16420a(p58.class, th2);
                        return;
                    }
                } catch (Throwable th3) {
                    lp1.m16420a(xr6.class, th3);
                    return;
                }
            case 3:
                Context context = (Context) this.f51885b;
                String str2 = (String) this.f51886c;
                Set set2 = lp1.f49971a;
                if (set2.contains(xr6.class)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String strConcat = str2.concat("pingForOnDevice");
                    if (sharedPreferences.getLong(strConcat, 0L) == 0) {
                        p58 p58Var2 = p58.f55608b;
                        if (!set2.contains(p58.class)) {
                            try {
                                p58.f55608b.m18911q(RemoteServiceWrapper$EventType.MOBILE_APP_INSTALL, str2, EmptyList.f47638a);
                            } catch (Throwable th4) {
                                lp1.m16420a(p58.class, th4);
                            }
                            break;
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(strConcat, System.currentTimeMillis());
                        editorEdit.apply();
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    lp1.m16420a(xr6.class, th5);
                    return;
                }
            case 4:
                il7 il7Var = (il7) this.f51885b;
                a8b a8bVar = (a8b) this.f51886c;
                synchronized (il7Var.f44277k) {
                    try {
                        Iterator it = il7Var.f44276j.iterator();
                        while (it.hasNext()) {
                            ((vu2) it.next()).mo2918b(a8bVar, false);
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                    break;
                }
                return;
            case 5:
                C0717b c0717b = (C0717b) this.f51885b;
                st8 st8Var = (st8) this.f51886c;
                c0717b.f6481V = c0717b.f6472M == null ? st8Var : new h60(-9223372036854775807L);
                c0717b.f6482W = st8Var.mo3545h();
                if (!c0717b.f6495e0 && st8Var.mo3545h() == -9223372036854775807L) {
                    z = true;
                }
                c0717b.f6483X = z;
                c0717b.f6484Y = z ? 7 : 1;
                if (c0717b.f6477R) {
                    c0717b.f6498g.m16944v(c0717b.f6482W, st8Var, z);
                    return;
                } else {
                    c0717b.m2562u();
                    return;
                }
            case 6:
                v68 v68Var = (v68) this.f51885b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f51886c;
                try {
                    nba.m17318a().f52578d.m17169b(v68Var.f64946h.f42139a.m19659b(Priority.HIGHEST), 1);
                    break;
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 7:
                ((vp1) this.f51885b).m23462a((h50) this.f51886c);
                return;
            case 8:
                hz8 hz8Var = (hz8) this.f51885b;
                l67 l67Var = (l67) this.f51886c;
                rl7 rl7Var = hz8Var.f43246a;
                if (rl7Var.m20695k()) {
                    return;
                }
                l67Var.m15902e(hz8Var.f43247b.f35077a, hz8Var.f43249d);
                if (rl7Var.m20695k()) {
                    return;
                }
                rl7Var.m20703s().m17821a(l67Var);
                return;
            case 9:
                gf9 gf9Var = (gf9) this.f51885b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f51886c;
                SurfaceTexture surfaceTexture2 = gf9Var.f40746g;
                Surface surface = gf9Var.f40747h;
                Surface surface2 = new Surface(surfaceTexture);
                gf9Var.f40746g = surfaceTexture;
                gf9Var.f40747h = surface2;
                Iterator it2 = gf9Var.f40740a.iterator();
                while (it2.hasNext()) {
                    ((ew2) it2.next()).f37985a.m14698D(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = (ArrayList) this.f51885b;
                StorageQueueChangedAction storageQueueChangedAction = (StorageQueueChangedAction) this.f51886c;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ArrayList arrayListM3224U = b34.m3224U(((o67) it3.next()).f53898b);
                    if (!arrayListM3224U.isEmpty()) {
                        Iterator it4 = arrayListM3224U.iterator();
                        while (it4.hasNext()) {
                            ((p67) it4.next()).mo10310a(storageQueueChangedAction);
                        }
                    }
                }
                return;
            case 11:
                ((qfa) ((ny8) this.f51885b).f53415c).m19913m((zg9) this.f51886c, 3);
                return;
            case 12:
                t33 t33Var = (t33) this.f51885b;
                ((zx5) t33Var.f61787b).m25844i(t33Var.f61786a, (List) this.f51886c);
                return;
            case 13:
                C3165jz c3165jz = (C3165jz) this.f51885b;
                l41 l41Var = (l41) this.f51886c;
                ew2 ew2Var = c3165jz.f46414b;
                String str3 = uma.f64080a;
                bl2.m3818k(ew2Var.f37985a.f46256C, l41Var);
                return;
            case 14:
                C3165jz c3165jz2 = (C3165jz) this.f51885b;
                lsa lsaVar = (lsa) this.f51886c;
                ew2 ew2Var2 = c3165jz2.f46414b;
                String str4 = uma.f64080a;
                ew2Var2.f37985a.f46295m.m23271d(25, new C3440oy(lsaVar, 13));
                return;
            case 15:
                C3165jz c3165jz3 = (C3165jz) this.f51885b;
                String str5 = (String) this.f51886c;
                ew2 ew2Var3 = c3165jz3.f46414b;
                String str6 = uma.f64080a;
                l52 l52Var = ew2Var3.f37985a.f46300r;
                C3496qf c3496qfM15807I = l52Var.m15807I();
                l52Var.m15808J(c3496qfM15807I, 1019, new y42(c3496qfM15807I, str5, i));
                return;
            case 16:
                ota otaVar = (ota) this.f51885b;
                nta ntaVar = (nta) this.f51886c;
                if (lp1.f49971a.contains(ota.class)) {
                    return;
                }
                try {
                    try {
                        Timer timer = otaVar.f54982c;
                        if (timer != null) {
                            timer.cancel();
                        }
                        otaVar.f54983d = null;
                        Timer timer2 = new Timer();
                        timer2.scheduleAtFixedRate(ntaVar, 0L, 1000L);
                        otaVar.f54982c = timer2;
                        return;
                    } catch (Exception e) {
                        Log.e(ota.f54979e, "Error scheduling indexing job", e);
                        return;
                    }
                } catch (Throwable th7) {
                    lp1.m16420a(ota.class, th7);
                    return;
                }
            case 17:
                String str7 = (String) this.f51885b;
                ota otaVar2 = (ota) this.f51886c;
                if (lp1.f49971a.contains(ota.class)) {
                    return;
                }
                try {
                    byte[] bytes = str7.getBytes(yu0.f70463a);
                    bytes.getClass();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.getClass();
                        messageDigest.update(bytes);
                        byte[] bArrDigest = messageDigest.digest();
                        StringBuilder sb = new StringBuilder();
                        bArrDigest.getClass();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b >> 4) & 15));
                            sb.append(Integer.toHexString(b & 15));
                        }
                        string = sb.toString();
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                    Date date = AccessToken.f11306l;
                    AccessToken accessTokenM24363t = x74.m24363t();
                    if (string == null || !string.equals(otaVar2.f54983d)) {
                        String str8 = ota.f54979e;
                        otaVar2.m18509b(vad.m23214a(str7, accessTokenM24363t, sy2.m21767b()), string);
                        return;
                    }
                    return;
                } catch (Throwable th8) {
                    lp1.m16420a(ota.class, th8);
                    return;
                }
            case 18:
                String str9 = (String) this.f51885b;
                String str10 = (String) this.f51886c;
                str10.getClass();
                HashSet hashSet = gua.f41351e;
                to2.m22256k(str9, str10, new float[0]);
                return;
            case 19:
                uva uvaVar = (uva) this.f51885b;
                View[] viewArr = (View[]) this.f51886c;
                if (uvaVar.f64430p != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(uvaVar.f64430p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (uvaVar.f64431q != -1) {
                    for (View view3 : viewArr) {
                        view3.setTag(uvaVar.f64431q, null);
                    }
                    return;
                }
                return;
            case 20:
                yab yabVar = (yab) this.f51885b;
                PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality = (PlayerConstants$PlaybackQuality) this.f51886c;
                r3b r3bVar = yabVar.f69583a;
                for (AbstractC2949e2 abstractC2949e2 : r3bVar.getListeners()) {
                    vab r3bVar2 = r3bVar.getInstance();
                    abstractC2949e2.getClass();
                    r3bVar2.getClass();
                    playerConstants$PlaybackQuality.getClass();
                }
                return;
            case 21:
                yab yabVar2 = (yab) this.f51885b;
                PlayerConstants$PlaybackRate playerConstants$PlaybackRate = (PlayerConstants$PlaybackRate) this.f51886c;
                r3b r3bVar3 = yabVar2.f69583a;
                Iterator<T> it5 = r3bVar3.getListeners().iterator();
                while (it5.hasNext()) {
                    ((AbstractC2949e2) it5.next()).mo8498c(r3bVar3.getInstance(), playerConstants$PlaybackRate);
                }
                return;
            case 22:
                yab yabVar3 = (yab) this.f51885b;
                String str11 = (String) this.f51886c;
                r3b r3bVar4 = yabVar3.f69583a;
                Iterator<T> it6 = r3bVar4.getListeners().iterator();
                while (it6.hasNext()) {
                    ((AbstractC2949e2) it6.next()).mo10795g(r3bVar4.getInstance(), str11);
                }
                return;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                yab yabVar4 = (yab) this.f51885b;
                PlayerConstants$PlayerError playerConstants$PlayerError = (PlayerConstants$PlayerError) this.f51886c;
                r3b r3bVar5 = yabVar4.f69583a;
                Iterator<T> it7 = r3bVar5.getListeners().iterator();
                while (it7.hasNext()) {
                    ((AbstractC2949e2) it7.next()).mo10794b(r3bVar5.getInstance(), playerConstants$PlayerError);
                }
                return;
            default:
                yab yabVar5 = (yab) this.f51885b;
                PlayerConstants$PlayerState playerConstants$PlayerState = (PlayerConstants$PlayerState) this.f51886c;
                r3b r3bVar6 = yabVar5.f69583a;
                Iterator<T> it8 = r3bVar6.getListeners().iterator();
                while (it8.hasNext()) {
                    ((AbstractC2949e2) it8.next()).mo8500e(r3bVar6.getInstance(), playerConstants$PlayerState);
                }
                return;
        }
    }

    public /* synthetic */ mv5(int i, Object obj, Object obj2) {
        this.f51884a = i;
        this.f51885b = obj;
        this.f51886c = obj2;
    }
}
