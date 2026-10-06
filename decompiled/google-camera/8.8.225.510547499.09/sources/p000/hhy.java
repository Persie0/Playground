package p000;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhy implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f27869a;

    /* JADX INFO: renamed from: b */
    private final Object f27870b;

    public hhy(jfs jfsVar, int i, byte[] bArr, byte[] bArr2) {
        this.f27869a = i;
        this.f27870b = jfsVar;
    }

    public hhy(jfs jfsVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f27869a = i;
        this.f27870b = jfsVar;
    }

    public hhy(oju ojuVar, int i) {
        this.f27869a = i;
        this.f27870b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static hhy m10330a(oju ojuVar) {
        return new hhy(ojuVar, 18);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f27869a) {
            case 0:
                hah hahVar = (hah) this.f27870b.get();
                jwn jwnVarM13639i = jwr.m13639i(hahVar.mo10029a(gzy.f27052k), hahVar.mo10029a(gzy.f27057p));
                jwnVarM13639i.getClass();
                return jwnVarM13639i;
            case 1:
                return new ihk(((inc) this.f27870b).get());
            case 2:
                dhv dhvVar = (dhv) this.f27870b.get();
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6175c();
                SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(builder.setUsage(11).setContentType(4).setFlags(1).setHapticChannelsMuted(false).build()).setMaxStreams(3).build();
                soundPoolBuild.getClass();
                return soundPoolBuild;
            case 3:
                dhv dhvVar2 = (dhv) this.f27870b.get();
                SoundPool.Builder builder2 = new SoundPool.Builder();
                AudioAttributes.Builder builder3 = new AudioAttributes.Builder();
                dhx dhxVar2 = dib.f11240a;
                dhvVar2.mo6175c();
                SoundPool soundPoolBuild2 = builder2.setAudioAttributes(builder3.setUsage(13).setContentType(4).setFlags(1).build()).setMaxStreams(3).build();
                soundPoolBuild2.getClass();
                return soundPoolBuild2;
            case 4:
                return new hak(((hai) this.f27870b.get()).mo10030b(gzy.f26995G));
            case 5:
                return new hak(((hai) this.f27870b.get()).mo10030b(gzy.f26994F));
            case 6:
                return new jfs((hjg) this.f27870b.get());
            case 7:
                return ((CameraActivityTiming) this.f27870b.get()).f6964d;
            case 8:
                return ((jfs) this.f27870b).f33914a;
            case 9:
                Instrumentation instrumentation = (Instrumentation) this.f27870b.get();
                Instrumentation.m4295d(instrumentation);
                instrumentation.getClass();
                return instrumentation;
            case 10:
                return new ihk((fcp) this.f27870b.get());
            case 11:
                return new jfs(((dws) this.f27870b).m6830a(), (char[]) null);
            case 12:
                kri kriVarM14759a = krj.m14759a(((dws) this.f27870b).m6830a());
                kriVarM14759a.m14757g(lrg.f39076a);
                kriVarM14759a.m14758h(lrg.f39076a);
                kriVarM14759a.f37040c = "file_name";
                kriVarM14759a.m14756f();
                kriVarM14759a.m14752b();
                kriVarM14759a.f37042e = "restore_path";
                kriVarM14759a.m14753c();
                kriVarM14759a.m14754d(lme.m15715a(1));
                kriVarM14759a.m14755e(lme.m15715a(2));
                return kriVarM14759a.m14751a();
            case 13:
                dhv dhvVar3 = (dhv) this.f27870b.get();
                dhx dhxVar3 = diw.f11719a;
                dhvVar3.mo6179g();
                return mqu.f41450a;
            case 14:
                dhv dhvVar4 = (dhv) this.f27870b.get();
                dhx dhxVar4 = diw.f11719a;
                dhvVar4.mo6179g();
                return mqu.f41450a;
            case 15:
                dhv dhvVar5 = (dhv) this.f27870b.get();
                if (dhvVar5.mo6184l(dib.f11351ce)) {
                    dhvVar5.mo6177e();
                }
                return mqu.f41450a;
            case 16:
                return ((jfs) this.f27870b).f33914a;
            case 17:
                return new hoe((Instrumentation) this.f27870b.get());
            case 18:
                mrm mrmVar = (mrm) this.f27870b.get();
                Object objM17136H = mrmVar.mo16813g() ? mxk.m17136H((ech) mrmVar.mo16809c()) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 19:
                return new jwf(Double.valueOf(((hqo) this.f27870b.get()).m10616b()));
            default:
                hqo hqoVar = (hqo) this.f27870b.get();
                return new jwf(hqoVar.f29158d.containsKey(hqoVar.f29160f) ? hqoVar.f29160f : hqn.SLOW);
        }
    }
}
