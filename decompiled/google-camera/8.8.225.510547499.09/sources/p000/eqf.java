package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eqf implements LasagnaCallbacks, eqt {

    /* JADX INFO: renamed from: a */
    public static final nbh f15113a = nbh.m17259h("com/google/android/apps/camera/lasagna/MotionBlurProcessingSession");

    /* JADX INFO: renamed from: b */
    public final eqc f15114b;

    /* JADX INFO: renamed from: c */
    public final epy f15115c;

    /* JADX INFO: renamed from: d */
    public final int f15116d;

    /* JADX INFO: renamed from: e */
    public final equ f15117e;

    /* JADX INFO: renamed from: f */
    public final kbz f15118f;

    /* JADX INFO: renamed from: g */
    public final nqf f15119g;

    /* JADX INFO: renamed from: h */
    public final gyh f15120h;

    /* JADX INFO: renamed from: i */
    public eem f15121i;

    /* JADX INFO: renamed from: j */
    public nqf f15122j;

    /* JADX INFO: renamed from: k */
    public Runnable f15123k;

    /* JADX INFO: renamed from: l */
    public eqy f15124l;

    /* JADX INFO: renamed from: m */
    public boolean f15125m = false;

    /* JADX INFO: renamed from: n */
    public final cwd f15126n = new cwd((int[]) null);

    /* JADX INFO: renamed from: o */
    private final nsk f15127o;

    /* JADX INFO: renamed from: p */
    private final Executor f15128p;

    /* JADX INFO: renamed from: q */
    private final nqf f15129q;

    /* JADX INFO: renamed from: r */
    private final gav f15130r;

    /* JADX WARN: Type inference failed for: r1v1, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [gyh, java.lang.Object] */
    public eqf(nsk nskVar, eqc eqcVar, Executor executor, kbz kbzVar, glk glkVar, epy epyVar, equ equVar, nqf nqfVar, nqf nqfVar2, byte[] bArr, byte[] bArr2) {
        this.f15127o = nskVar;
        this.f15114b = eqcVar;
        this.f15128p = executor;
        this.f15118f = kbzVar;
        this.f15130r = glkVar.f25501b;
        this.f15115c = epyVar;
        this.f15117e = equVar;
        this.f15119g = nqfVar;
        this.f15129q = nqfVar2;
        this.f15116d = glkVar.f25502c.mo9902h().f26874a;
        this.f15120h = glkVar.f25502c;
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    /* JADX INFO: renamed from: a */
    public final synchronized void mo5159a(final int i, int i2, final String str, mrm mrmVar) {
        this.f15125m = true;
        Runnable runnable = this.f15123k;
        if (runnable != null) {
            runnable.run();
        }
        this.f15129q.mo14894e(true);
        if (i2 == 0) {
            nqf nqfVar = this.f15122j;
            if (nqfVar != null) {
                nqfVar.mo14894e(Boolean.TRUE);
            }
            cwd cwdVar = this.f15126n;
            Object obj = cwdVar.f9866a;
            if (!((nxl) obj).f44974b.m18142ac()) {
                ((nxl) obj).mo18106p();
            }
            nkr nkrVar = (nkr) ((nxl) obj).f44974b;
            nkr nkrVar2 = nkr.f43268x;
            nkrVar.f43270a |= 2;
            nkrVar.f43272c = true;
            if (mrmVar.mo16813g()) {
                nub nubVar = (nub) mrmVar.mo16809c();
                nxv nxvVar = nubVar.f44624h;
                if (!nxvVar.isEmpty()) {
                    Object obj2 = cwdVar.f9866a;
                    float fAbs = Math.abs(((Float) mkv.m16515W(nxvVar)).floatValue());
                    if (!((nxl) obj2).f44974b.m18142ac()) {
                        ((nxl) obj2).mo18106p();
                    }
                    nkr nkrVar3 = (nkr) ((nxl) obj2).f44974b;
                    nkrVar3.f43270a |= 32;
                    nkrVar3.f43275f = fAbs;
                }
                if ((nubVar.f44617a & 128) != 0) {
                    Object obj3 = cwdVar.f9866a;
                    float f = nubVar.f44621e;
                    if (!((nxl) obj3).f44974b.m18142ac()) {
                        ((nxl) obj3).mo18106p();
                    }
                    nkr nkrVar4 = (nkr) ((nxl) obj3).f44974b;
                    nkrVar4.f43270a |= 64;
                    nkrVar4.f43276g = f;
                }
                if ((nubVar.f44617a & 256) != 0) {
                    Object obj4 = cwdVar.f9866a;
                    float f2 = nubVar.f44622f;
                    if (!((nxl) obj4).f44974b.m18142ac()) {
                        ((nxl) obj4).mo18106p();
                    }
                    nkr nkrVar5 = (nkr) ((nxl) obj4).f44974b;
                    nkrVar5.f43270a |= 128;
                    nkrVar5.f43277h = f2;
                }
                if ((nubVar.f44617a & 16) != 0) {
                    Object obj5 = cwdVar.f9866a;
                    int i3 = nubVar.f44619c;
                    if (!((nxl) obj5).f44974b.m18142ac()) {
                        ((nxl) obj5).mo18106p();
                    }
                    nkr nkrVar6 = (nkr) ((nxl) obj5).f44974b;
                    nkrVar6.f43270a |= 512;
                    nkrVar6.f43279j = i3;
                }
                if ((nubVar.f44617a & 32) != 0) {
                    Object obj6 = cwdVar.f9866a;
                    int i4 = nubVar.f44620d;
                    if (!((nxl) obj6).f44974b.m18142ac()) {
                        ((nxl) obj6).mo18106p();
                    }
                    nkr nkrVar7 = (nkr) ((nxl) obj6).f44974b;
                    nkrVar7.f43270a |= 1024;
                    nkrVar7.f43280k = i4;
                }
                if ((nubVar.f44617a & 512) != 0) {
                    Object obj7 = cwdVar.f9866a;
                    int i5 = nubVar.f44623g;
                    if (!((nxl) obj7).f44974b.m18142ac()) {
                        ((nxl) obj7).mo18106p();
                    }
                    nkr nkrVar8 = (nkr) ((nxl) obj7).f44974b;
                    nkrVar8.f43270a |= 2048;
                    nkrVar8.f43281l = i5;
                }
                if ((nubVar.f44617a & 2048) != 0) {
                    Object obj8 = cwdVar.f9866a;
                    boolean z = nubVar.f44625i;
                    if (!((nxl) obj8).f44974b.m18142ac()) {
                        ((nxl) obj8).mo18106p();
                    }
                    nkr nkrVar9 = (nkr) ((nxl) obj8).f44974b;
                    nkrVar9.f43270a |= 4096;
                    nkrVar9.f43282m = z;
                }
                if ((nubVar.f44617a & 8) != 0) {
                    Object obj9 = cwdVar.f9866a;
                    int i6 = nubVar.f44618b;
                    if (!((nxl) obj9).f44974b.m18142ac()) {
                        ((nxl) obj9).mo18106p();
                    }
                    nkr nkrVar10 = (nkr) ((nxl) obj9).f44974b;
                    nkrVar10.f43270a |= 8192;
                    nkrVar10.f43283n = i6;
                }
                if ((nubVar.f44617a & 524288) != 0) {
                    Object obj10 = cwdVar.f9866a;
                    ntz ntzVar = nubVar.f44626j;
                    if (ntzVar == null) {
                        ntzVar = ntz.f44599g;
                    }
                    nix nixVarM5638D = cwd.m5638D(ntzVar);
                    if (!((nxl) obj10).f44974b.m18142ac()) {
                        ((nxl) obj10).mo18106p();
                    }
                    nkr nkrVar11 = (nkr) ((nxl) obj10).f44974b;
                    nixVarM5638D.getClass();
                    nkrVar11.f43285p = nixVarM5638D;
                    nkrVar11.f43270a |= 32768;
                }
                if ((nubVar.f44617a & 4194304) != 0) {
                    Object obj11 = cwdVar.f9866a;
                    ntz ntzVar2 = nubVar.f44629m;
                    if (ntzVar2 == null) {
                        ntzVar2 = ntz.f44599g;
                    }
                    nix nixVarM5638D2 = cwd.m5638D(ntzVar2);
                    if (!((nxl) obj11).f44974b.m18142ac()) {
                        ((nxl) obj11).mo18106p();
                    }
                    nkr nkrVar12 = (nkr) ((nxl) obj11).f44974b;
                    nixVarM5638D2.getClass();
                    nkrVar12.f43286q = nixVarM5638D2;
                    nkrVar12.f43270a |= 65536;
                }
                if ((nubVar.f44617a & 8388608) != 0) {
                    Object obj12 = cwdVar.f9866a;
                    ntz ntzVar3 = nubVar.f44630n;
                    if (ntzVar3 == null) {
                        ntzVar3 = ntz.f44599g;
                    }
                    nix nixVarM5638D3 = cwd.m5638D(ntzVar3);
                    if (!((nxl) obj12).f44974b.m18142ac()) {
                        ((nxl) obj12).mo18106p();
                    }
                    nkr nkrVar13 = (nkr) ((nxl) obj12).f44974b;
                    nixVarM5638D3.getClass();
                    nkrVar13.f43287r = nixVarM5638D3;
                    nkrVar13.f43270a |= 131072;
                }
                if ((nubVar.f44617a & 16777216) != 0) {
                    Object obj13 = cwdVar.f9866a;
                    ntz ntzVar4 = nubVar.f44631o;
                    if (ntzVar4 == null) {
                        ntzVar4 = ntz.f44599g;
                    }
                    nix nixVarM5638D4 = cwd.m5638D(ntzVar4);
                    if (!((nxl) obj13).f44974b.m18142ac()) {
                        ((nxl) obj13).mo18106p();
                    }
                    nkr nkrVar14 = (nkr) ((nxl) obj13).f44974b;
                    nixVarM5638D4.getClass();
                    nkrVar14.f43288s = nixVarM5638D4;
                    nkrVar14.f43270a |= 262144;
                }
                if ((nubVar.f44617a & 33554432) != 0) {
                    Object obj14 = cwdVar.f9866a;
                    ntz ntzVar5 = nubVar.f44632p;
                    if (ntzVar5 == null) {
                        ntzVar5 = ntz.f44599g;
                    }
                    nix nixVarM5638D5 = cwd.m5638D(ntzVar5);
                    if (!((nxl) obj14).f44974b.m18142ac()) {
                        ((nxl) obj14).mo18106p();
                    }
                    nkr nkrVar15 = (nkr) ((nxl) obj14).f44974b;
                    nixVarM5638D5.getClass();
                    nkrVar15.f43289t = nixVarM5638D5;
                    nkrVar15.f43270a = 524288 | nkrVar15.f43270a;
                }
                if ((nubVar.f44617a & 1048576) != 0) {
                    Object obj15 = cwdVar.f9866a;
                    float f3 = nubVar.f44627k;
                    if (!((nxl) obj15).f44974b.m18142ac()) {
                        ((nxl) obj15).mo18106p();
                    }
                    nkr nkrVar16 = (nkr) ((nxl) obj15).f44974b;
                    nkrVar16.f43270a = 1048576 | nkrVar16.f43270a;
                    nkrVar16.f43290u = f3;
                }
                if ((nubVar.f44617a & 2097152) != 0) {
                    Object obj16 = cwdVar.f9866a;
                    float f4 = nubVar.f44628l;
                    if (!((nxl) obj16).f44974b.m18142ac()) {
                        ((nxl) obj16).mo18106p();
                    }
                    nkr nkrVar17 = (nkr) ((nxl) obj16).f44974b;
                    nkrVar17.f43270a = 2097152 | nkrVar17.f43270a;
                    nkrVar17.f43291v = f4;
                }
                if ((nubVar.f44617a & 67108864) != 0) {
                    Object obj17 = cwdVar.f9866a;
                    nty ntyVar = nubVar.f44633q;
                    if (ntyVar == null) {
                        ntyVar = nty.f44594c;
                    }
                    nxl nxlVarM18137O = nhj.f42326d.m18137O();
                    double d = ntyVar.f44596a;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar = nxlVarM18137O.f44974b;
                    nhj nhjVar = (nhj) nxqVar;
                    nhjVar.f42328a |= 1;
                    nhjVar.f42329b = d;
                    int i7 = ntyVar.f44597b;
                    if (!nxqVar.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nhj nhjVar2 = (nhj) nxlVarM18137O.f44974b;
                    nhjVar2.f42328a |= 2;
                    nhjVar2.f42330c = i7;
                    nhj nhjVar3 = (nhj) nxlVarM18137O.mo18103l();
                    if (!((nxl) obj17).f44974b.m18142ac()) {
                        ((nxl) obj17).mo18106p();
                    }
                    nkr nkrVar18 = (nkr) ((nxl) obj17).f44974b;
                    nhjVar3.getClass();
                    nkrVar18.f43292w = nhjVar3;
                    nkrVar18.f43270a |= 4194304;
                }
            }
            this.f15114b.m7677b(i, true);
        } else {
            ((nbe) ((nbe) f15113a.m17252c()).mo17276G(1795)).mo17296u("[shot-%s] Final error status [%s]. ", i, str);
            if (i2 != 10) {
                this.f15128p.execute(new Runnable() { // from class: eqe
                    @Override // java.lang.Runnable
                    public final void run() {
                        eqy eqyVar;
                        eem eemVar;
                        idb idbVarM7641a;
                        mrm mrmVarM16829i;
                        eqf eqfVar = this.f15110a;
                        int i8 = i;
                        String str2 = str;
                        mrm mrmVarM16820a = mre.m16820a(nua.class, str2.toUpperCase(Locale.ROOT));
                        if (mrmVarM16820a.mo16813g()) {
                            String.format(Locale.ROOT, "Received failure signal %d (%s) for shot %d", Integer.valueOf(((nua) mrmVarM16820a.mo16809c()).f44614f), ((nua) mrmVarM16820a.mo16809c()).name(), Integer.valueOf(i8));
                        }
                        if (mrmVarM16820a.mo16813g() && (eqyVar = eqfVar.f15124l) != null && (eemVar = eqfVar.f15121i) != null) {
                            nua nuaVar = (nua) mrmVarM16820a.mo16809c();
                            ((nbe) ((nbe) eqh.f15135a.m17252c()).mo17276G(1825)).mo17299x("onMotionBlurFailureSignal %s for shot %d", nuaVar.name(), eemVar.m7218a());
                            mrm mrmVar2 = ((eqh) eqyVar).f15139e;
                            if (mrmVar2.mo16813g()) {
                                eps epsVar = (eps) mrmVar2.mo16809c();
                                idb idbVar = (idb) epsVar.f15037a.get(nuaVar);
                                if (idbVar != null) {
                                    mrmVarM16829i = mrm.m16829i(idbVar);
                                } else {
                                    switch (nuaVar.ordinal()) {
                                        case 1:
                                            idbVarM7641a = epsVar.m7641a(epsVar.f30404h.getString(C0100R.string.phone_moved_fast_chip));
                                            break;
                                        case 2:
                                            idbVarM7641a = epsVar.m7641a(epsVar.f30404h.getString(C0100R.string.subject_moved_fast_chip));
                                            break;
                                        case 3:
                                        default:
                                            idbVarM7641a = null;
                                            break;
                                        case 4:
                                            idbVarM7641a = epsVar.m7641a(epsVar.f30404h.getString(C0100R.string.not_enough_motion_chip));
                                            break;
                                    }
                                    if (idbVarM7641a != null) {
                                        epsVar.f15037a.put(nuaVar, idbVarM7641a);
                                        mrmVarM16829i = mrm.m16829i(idbVarM7641a);
                                    } else {
                                        mrmVarM16829i = mqu.f41450a;
                                    }
                                }
                                if (mrmVarM16829i.mo16813g()) {
                                    epsVar.m11105g((idb) mrmVarM16829i.mo16809c());
                                }
                            }
                        }
                        cwd cwdVar2 = eqfVar.f15126n;
                        nxl nxlVar = (nxl) cwdVar2.f9866a;
                        if (!nxlVar.f44974b.m18142ac()) {
                            nxlVar.mo18106p();
                        }
                        nkr nkrVar19 = (nkr) nxlVar.f44974b;
                        nkr nkrVar20 = nkr.f43268x;
                        nkrVar19.f43270a = 2 | nkrVar19.f43270a;
                        nkrVar19.f43272c = false;
                        if (mrmVarM16820a.mo16813g()) {
                            Object obj18 = cwdVar2.f9866a;
                            int i9 = ((nua) mrmVarM16820a.mo16809c()).f44614f;
                            nxl nxlVar2 = (nxl) obj18;
                            if (!nxlVar2.f44974b.m18142ac()) {
                                nxlVar2.mo18106p();
                            }
                            nkr nkrVar21 = (nkr) nxlVar2.f44974b;
                            nkrVar21.f43270a |= 4;
                            nkrVar21.f43273d = i9;
                        } else {
                            nxl nxlVar3 = (nxl) cwdVar2.f9866a;
                            if (!nxlVar3.f44974b.m18142ac()) {
                                nxlVar3.mo18106p();
                            }
                            nkr nkrVar22 = (nkr) nxlVar3.f44974b;
                            nkrVar22.f43270a |= 4;
                            nkrVar22.f43273d = 0;
                        }
                        eqfVar.m7682c();
                        boolean zEndsWith = str2.endsWith(nua.TOO_EARLY_FOR_HDR_PLUS_RESULT.name());
                        eqfVar.f15114b.m7676a(i8, zEndsWith, cik.f5805m);
                        nqf nqfVar2 = eqfVar.f15122j;
                        if (nqfVar2 == null || nqfVar2.isDone()) {
                            return;
                        }
                        eqfVar.f15122j.mo8566a(zEndsWith ? new dop(str2) : new IllegalStateException(str2));
                    }
                });
            }
        }
        ((hjz) this.f15120h.mo9905k()).f28095u = this.f15126n.m5646C();
    }

    @Override // p000.eqt
    /* JADX INFO: renamed from: b */
    public final synchronized void mo7612b(ntv ntvVar) {
        if (this.f15125m) {
            ntvVar.f44591b.m4953c();
            ntvVar.f44593d.run();
        } else {
            ntvVar.f44591b.m4953c();
            if (this.f15114b.m7679d(this.f15116d, "onPslFrame", new ekr(this, ntvVar, 13), new eqd(ntvVar.f44591b.m4953c(), ntvVar, 0)) != 1) {
                ((nbe) ((nbe) f15113a.m17252c()).mo17276G((char) 1800)).mo17290o("Couldn't post PSL frame");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7682c() {
        this.f15129q.mo14894e(false);
        equ equVar = this.f15117e;
        if (equVar != null) {
            equVar.mo7615b(this.f15116d);
        }
        gav gavVar = this.f15130r;
        if (gavVar != null) {
            gavVar.mo9013f();
        }
    }

    @Override // p000.eqt
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7613d(boolean z) {
        this.f15129q.mo14894e(true);
        if (!this.f15125m) {
            String str = true != z ? "endShot" : "abortShot";
            if (this.f15114b.m7679d(this.f15116d, "onPslDone: ".concat(str), new cxm(this, str, z, 2), new elu(str, 15)) != 1) {
                ((nbe) ((nbe) f15113a.m17252c()).mo17276G((char) 1799)).mo17293r("Couldn't post %s", str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [gyh, java.lang.Object] */
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
    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    /* JADX INFO: renamed from: e */
    public final void mo5160e(int i, long j, int i2, String str, ShotMetadata shotMetadata) {
        mrm mrmVarM16829i;
        eem eemVar;
        int i3;
        eez eezVar;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(j);
        if (i2 == 0) {
            throw null;
        }
        objArr[1] = Integer.valueOf(i2 - 1);
        objArr[2] = ntw.m17715a(i2);
        objArr[3] = str;
        String.format(locale, "Got image!!! allocationId = %d, outputType=%d (%s), description=%s)", objArr);
        this.f15118f.mo13961e("MotionBlur#onImage");
        mrm mrmVarM17645a = this.f15127o.m17645a(j);
        if (mrmVarM17645a.mo16813g()) {
            this.f15118f.mo13961e(rmwTRjObXLGH.yuiDw);
            InterleavedImageU8 interleavedImageU8 = (InterleavedImageU8) mrmVarM17645a.mo16809c();
            interleavedImageU8.m5004c();
            interleavedImageU8.m5003b();
            interleavedImageU8.m5002a();
            mrmVarM16829i = mrm.m16829i(new eqx(interleavedImageU8, i2, shotMetadata));
            this.f15118f.mo13962f();
        } else {
            mrmVarM16829i = mqu.f41450a;
        }
        eqy eqyVar = this.f15124l;
        if (eqyVar != null && (eemVar = this.f15121i) != null) {
            try {
                eemVar.m7218a();
                ept eptVar = (ept) ((eqh) eqyVar).f15138d.get(eemVar);
                if (eptVar == null) {
                    if (mrmVarM16829i.mo16813g()) {
                        ((eqx) mrmVarM16829i.mo16809c()).close();
                    }
                    throw new IllegalStateException("Shot hasn't been started yet");
                }
                if (mrmVarM16829i.mo16813g()) {
                    long jM7218a = eemVar.m7218a();
                    eqx eqxVar = (eqx) mrmVarM16829i.mo16809c();
                    if (eqxVar.f15220d == 5) {
                        InterleavedImageU8 interleavedImageU9 = eqxVar.f15217a;
                        try {
                            ((eqh) eqyVar).f15137c.mo13961e("updateThumbnail");
                            ((eqh) eqyVar).f15137c.mo13961e("convert");
                            Bitmap bitmapM5654M = ((eqh) eqyVar).f15142h.m5654M(interleavedImageU9);
                            ((eqh) eqyVar).f15137c.mo13962f();
                            ((eqh) eqyVar).m7686l(eptVar, bitmapM5654M, eptVar.f15042d == eqz.LANDSCAPE);
                            ((eqh) eqyVar).f15137c.mo13962f();
                            eqxVar.close();
                        } catch (Throwable th) {
                            ((eqh) eqyVar).f15137c.mo13962f();
                            throw th;
                        }
                    } else {
                        InterleavedImageU8 interleavedImageU8Mo9807c = ((eqh) eqyVar).f15140f.mo9807c(eqxVar.f15217a, eptVar.f15043e, ((eqh) eqyVar).f15141g.mo14558k());
                        efa efaVar = ((eqh) eqyVar).f15136b;
                        gpv gpvVar = eqxVar.f15219c;
                        int i4 = eqxVar.f15220d - 1;
                        switch (i4) {
                            case 1:
                                i3 = 0;
                                break;
                            default:
                                i3 = 100;
                                break;
                        }
                        switch (i4) {
                            case 1:
                                eezVar = eez.ORIGINAL;
                                break;
                            default:
                                eezVar = eez.PRIMARY;
                                break;
                        }
                        kxk.m14975U(efaVar.m7265a(jM7218a, ihk.m11330i(interleavedImageU8Mo9807c), gpvVar, i3, 0, efaVar.f13792f.mo6184l(dib.f11297bD), eezVar, eptVar.f15040b.f13675v.f25502c, eptVar.f15044f, eqxVar.f15218b, mqu.f41450a), new eog(eqxVar, eptVar, 2), not.INSTANCE);
                    }
                } else {
                    ((nbe) ((nbe) eqh.f15135a.m17252c()).mo17276G(1827)).mo17293r("Motion Blur result %s was received, but ignored because it was invalid.", ntw.m17715a(i2));
                    eptVar.m7646e();
                }
            } catch (IllegalStateException e) {
                ((nbe) ((nbe) ((nbe) f15113a.m17252c()).mo17283h(e)).mo17276G(1796)).mo17291p("Error saving the image for shot %s.", i);
                if (mrmVarM16829i.mo16813g()) {
                    ((eqx) mrmVarM16829i.mo16809c()).close();
                }
            }
        }
        this.f15118f.mo13962f();
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onFinalStatusNative(int i, int i2, String str, byte[] bArr) {
        ntw.$default$onFinalStatusNative(this, i, i2, str, bArr);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onImageNative(int i, long j, int i2, String str, long j2) {
        ntw.$default$onImageNative(this, i, j, i2, str, j2);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [gaw, java.lang.Object] */
    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onProgress(int i, float f) {
        StringBuilder sb = new StringBuilder();
        sb.append("Processing progress: ");
        sb.append(f);
        eem eemVar = this.f15121i;
        if (eemVar != null) {
            eemVar.f13675v.f25500a.mo9016a(eqv.f15216t, f);
        } else {
            ((nbe) ((nbe) f15113a.m17252c()).mo17276G((char) 1798)).mo17290o("Shot has been aborted.");
        }
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onPslRequest(int i, boolean z, float f, float f2) {
        String.format("onPslRequest / isNeeded = %s, duration = %s, frameRate = %s", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2));
        if (!z || this.f15117e == null) {
            gav gavVar = this.f15130r;
            if (gavVar != null) {
                gavVar.mo9011d().mo9002e(0);
                gav gavVar2 = this.f15130r;
                gavVar2.getClass();
                gavVar2.mo9011d().mo9005h();
            }
            this.f15129q.mo14894e(true);
            m7682c();
            return;
        }
        try {
            float millis = TimeUnit.SECONDS.toMillis(1L) * f;
            gav gavVar3 = this.f15130r;
            long j = (long) millis;
            if (gavVar3 != null) {
                gavVar3.mo9011d().mo9002e(2);
                gav gavVar4 = this.f15130r;
                gavVar4.getClass();
                gavVar4.mo9011d().mo9004g(j);
                gav gavVar5 = this.f15130r;
                gavVar5.getClass();
                gavVar5.mo9011d().mo9005h();
                gav gavVar6 = this.f15130r;
                gavVar6.getClass();
                gavVar6.mo9011d().mo3415bf(null);
            }
            this.f15120h.mo9888T(j);
            this.f15117e.mo7616d(i, f, f2, ((Long) this.f15119g.get(5L, TimeUnit.SECONDS)).longValue());
            cwd cwdVar = this.f15126n;
            Object obj = cwdVar.f9866a;
            if (!((nxl) obj).f44974b.m18142ac()) {
                ((nxl) obj).mo18106p();
            }
            nkr nkrVar = (nkr) ((nxl) obj).f44974b;
            nkr nkrVar2 = nkr.f43268x;
            nkrVar.f43270a |= 16;
            nkrVar.f43274e = f;
            Object obj2 = cwdVar.f9866a;
            if (!((nxl) obj2).f44974b.m18142ac()) {
                ((nxl) obj2).mo18106p();
            }
            nkr nkrVar3 = (nkr) ((nxl) obj2).f44974b;
            nkrVar3.f43270a |= 256;
            nkrVar3.f43278i = f2;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m7682c();
        }
    }
}
