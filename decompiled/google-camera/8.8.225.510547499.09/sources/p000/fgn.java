package p000;

import android.media.MediaExtractor;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgn {

    /* JADX INFO: renamed from: a */
    private static final nbh f21920a = nbh.m17259h(wUzNh.eFJxroYcy);

    /* JADX INFO: renamed from: b */
    private final fhb f21921b;

    public fgn(fhb fhbVar) {
        this.f21921b = fhbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m8392a(kqc kqcVar) {
        mrm mrmVarM16829i;
        mws mwsVarM17099n;
        if (this.f21921b == fhb.FRAMEWORK) {
            try {
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    FileInputStream fileInputStreamM8561d = flu.m8561d(kqcVar);
                    try {
                        mediaExtractor.setDataSource(fileInputStreamM8561d.getFD());
                        int trackCount = mediaExtractor.getTrackCount();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i >= trackCount) {
                                mrmVarM16829i = mqu.f41450a;
                                fileInputStreamM8561d.close();
                                break;
                            }
                            String string = mediaExtractor.getTrackFormat(i).getString("mime");
                            if (lqi.m15853A(string) && (i2 = i2 + 1) == 2) {
                                mrmVarM16829i = mrm.m16829i(Integer.valueOf(i + 1));
                                fileInputStreamM8561d.close();
                                break;
                            } else {
                                if (string.equals("application/motionphoto-highres")) {
                                    mrmVarM16829i = mrm.m16829i(Integer.valueOf(i + 1));
                                    fileInputStreamM8561d.close();
                                    break;
                                }
                                i++;
                            }
                        }
                        mediaExtractor.release();
                        if (mrmVarM16829i.mo16813g()) {
                            mrmVarM16829i.mo16809c();
                            long jMo14681a = kqcVar.mo14681a();
                            int iIntValue = ((Integer) mrmVarM16829i.mo16809c()).intValue();
                            FileInputStream fileInputStreamM8561d2 = flu.m8561d(kqcVar);
                            try {
                                lpe lpeVar = new lpe(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamM8561d2.getChannel()).map(FileChannel.MapMode.READ_ONLY, 0L, jMo14681a), Arrays.asList("moov", "trak", "stbl", "mdia"));
                                kyo kyoVar = new kyo(((ByteBuffer) lpeVar.f38883b).position(), ((ByteBuffer) lpeVar.f38883b).limit());
                                lpe lpeVar2 = new lpe(mqu.f41450a);
                                try {
                                    lpeVar.m15818q(lpeVar2, lpeVar.m15805c(kyoVar));
                                    List listM15808g = lpeVar2.m15819r("moov").m15808g("trak");
                                    if (listM15808g.size() < 2 || listM15808g.size() > 10) {
                                        throw new kyp(String.format(Locale.US, "This file has %d trak boxes", Integer.valueOf(listM15808g.size())));
                                    }
                                    int iM15064a = lpeVar2.m15819r("moov").m15819r("mvhd").m15807f(kxu.f37678c).m15064a();
                                    if (iM15064a == 0) {
                                        throw new kyp("Video time scale is 0.");
                                    }
                                    Iterator it = listM15808g.iterator();
                                    kyn kynVar = null;
                                    kyn kynVarM15807f = null;
                                    int iMax = 0;
                                    int iM15064a2 = 0;
                                    while (it.hasNext()) {
                                        lpe lpeVar3 = (lpe) it.next();
                                        lpe lpeVarM15819r = lpeVar3.m15819r("tkhd");
                                        int iM15064a3 = lpeVarM15819r.m15807f(kxu.f37676a).m15064a();
                                        it = it;
                                        kyn kynVarM15807f2 = lpeVarM15819r.m15807f(kxu.f37677b);
                                        lpe lpeVarM15819r2 = lpeVar3.m15819r("mdia").m15819r("mdhd");
                                        if (iM15064a3 != iIntValue) {
                                            iMax = Math.max(iMax, kynVarM15807f2.m15064a());
                                        } else {
                                            kynVarM15807f = lpeVarM15819r2.m15807f(kxu.f37681f);
                                            iM15064a2 = lpeVarM15819r2.m15807f(kxu.f37680e).m15064a();
                                            if (iM15064a2 == 0) {
                                                throw new kyp("Media time scale is 0.");
                                            }
                                            kynVar = kynVarM15807f2;
                                        }
                                    }
                                    if (kynVar == null || iM15064a2 == 0 || kynVarM15807f == null) {
                                        throw new kyp("Track " + iIntValue + " not found.");
                                    }
                                    kyn kynVarM15807f3 = lpeVar2.m15819r("moov").m15819r("mvhd").m15807f(kxu.f37679d);
                                    if (kynVarM15807f3.m15064a() <= iMax) {
                                        String.format("Not fixing video since entire video length %d is shorter than the high-res track %d (video units)", Integer.valueOf(kynVarM15807f3.m15064a()), Integer.valueOf(iMax));
                                        int i3 = mws.f41739d;
                                        mwsVarM17099n = mzr.f41857a;
                                    } else {
                                        long jM15044a = kxu.m15044a(iM15064a, kynVarM15807f3.m15064a());
                                        long jM15044a2 = kxu.m15044a(iM15064a, kynVar.m15064a());
                                        long jM15044a3 = kxu.m15044a(iM15064a2, kynVarM15807f.m15064a());
                                        long jM15044a4 = kxu.m15044a(iM15064a, iMax);
                                        if (jM15044a == 0 || jM15044a2 == 0 || jM15044a3 == 0 || jM15044a4 == 0) {
                                            throw new kyp(String.format(Locale.US, hIAHJKEnGsNbz.mAWjQEEXERSvKjI, Long.valueOf(jM15044a), Long.valueOf(jM15044a2), Long.valueOf(jM15044a3), Long.valueOf(jM15044a4)));
                                        }
                                        if (jM15044a != jM15044a2) {
                                            throw new kyp(String.format(Locale.US, "Video length %d, but longest (high-res) track is %d", Long.valueOf(jM15044a), Long.valueOf(jM15044a2)));
                                        }
                                        if (Math.abs(jM15044a2 - jM15044a3) > Math.max(jM15044a2, jM15044a3) / 8) {
                                            throw new kyp(String.format(Locale.US, "Track and media lengths of the high-res track substantially different: %d vs %d", Long.valueOf(jM15044a2), Long.valueOf(jM15044a3)));
                                        }
                                        double d = jM15044a4;
                                        double d2 = jM15044a3;
                                        Double.isNaN(d2);
                                        if (d < d2 * 0.25d) {
                                            throw new kyp(String.format(Locale.US, "Target length too short: %d to %d?", Long.valueOf(jM15044a), Long.valueOf(jM15044a4)));
                                        }
                                        long jM15044a5 = kxu.m15044a(iM15064a, kynVarM15807f3.m15064a());
                                        long jM15044a6 = kxu.m15044a(iM15064a, iMax);
                                        String.format(Locale.US, "Fixing video length from %d us to %d us", Long.valueOf(jM15044a5), Long.valueOf(jM15044a6));
                                        mwsVarM17099n = mws.m17099n(new kxt(kynVarM15807f3.f37735a, iMax), new kxt(kynVar.f37735a, iMax), new kxt(kynVarM15807f.f37735a, (int) ((((long) iM15064a2) * jM15044a6) / 1000000)));
                                    }
                                    fileInputStreamM8561d2.close();
                                    if (mwsVarM17099n.isEmpty()) {
                                        return;
                                    }
                                    FileOutputStream fileOutputStreamMo14685e = kqcVar.mo14685e();
                                    try {
                                        nba it2 = mwsVarM17099n.iterator();
                                        while (it2.hasNext()) {
                                            kxt kxtVar = (kxt) it2.next();
                                            DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStreamMo14685e.getChannel()).position(kxtVar.f37674a);
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                                            byteBufferAllocate.putInt(kxtVar.f37675b);
                                            byteBufferAllocate.rewind();
                                            DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStreamMo14685e.getChannel()).write(byteBufferAllocate);
                                        }
                                        fileOutputStreamMo14685e.close();
                                    } catch (Throwable th) {
                                        try {
                                            fileOutputStreamMo14685e.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            throw th;
                                        }
                                    }
                                } catch (Exception e) {
                                    throw new kyp(e);
                                }
                            } catch (Throwable th3) {
                                try {
                                    fileInputStreamM8561d2.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            fileInputStreamM8561d.close();
                            throw th5;
                        } catch (Throwable th6) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                throw th5;
                            } catch (Exception e2) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    mediaExtractor.release();
                    throw th7;
                }
            } catch (IOException | kyp e3) {
                ((nbe) ((nbe) ((nbe) f21920a.m17251b()).mo17283h(e3)).mo17276G((char) 2233)).mo17290o("Couldn't apply MP4 fix");
            }
        }
    }
}
