package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;
import androidx.media3.muxer.AnnexBToAvcc;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.android.material.snackbar.VMX.rgoX;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amz implements amw {

    /* JADX INFO: renamed from: c */
    private final ams f769c;

    /* JADX INFO: renamed from: d */
    private FileOutputStream f770d;

    /* JADX INFO: renamed from: e */
    private FileChannel f771e;

    /* JADX INFO: renamed from: j */
    private final bck f776j;

    /* JADX INFO: renamed from: k */
    private final mca f777k;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f768b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final List f767a = new ArrayList();

    /* JADX INFO: renamed from: f */
    private long f772f = 0;

    /* JADX INFO: renamed from: g */
    private long f773g = 0;

    /* JADX INFO: renamed from: h */
    private long f774h = 0;

    /* JADX INFO: renamed from: i */
    private mzj f775i = mzj.m17175e(0L, 0L);

    public amz(FileOutputStream fileOutputStream, bck bckVar, mca mcaVar, ams amsVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f776j = bckVar;
        this.f770d = fileOutputStream;
        this.f771e = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
        this.f777k = mcaVar;
        this.f769c = amsVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:168:0x0638  */
    /* JADX WARN: Code duplicated, block: B:68:0x02d2  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    private final ByteBuffer m982b() {
        String str;
        byte b;
        ByteBuffer byteBufferAllocate;
        byte b2;
        ByteBuffer byteBufferM241j;
        ByteBuffer byteBufferM241j2;
        ByteBuffer byteBufferM242k;
        ByteBuffer byteBufferM241j3;
        String str2;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        ByteBuffer byteBufferM242k2;
        ByteBuffer byteBufferM242k3;
        ByteBuffer byteBufferM242k4;
        ArrayList arrayList;
        byte b3;
        ByteBuffer byteBufferM242k5;
        String str3;
        short s;
        short s2;
        short s3;
        byte b4;
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        for (int i6 = 0; i6 < this.f767a.size(); i6++) {
            amy amyVar = (amy) this.f767a.get(i6);
            if (!amyVar.f761c.isEmpty()) {
                jMin = Math.min(((MediaCodec.BufferInfo) amyVar.f761c.get(0)).presentationTimeUs, jMin);
            }
        }
        String str4 = "hdlr";
        if (jMin != Long.MAX_VALUE) {
            bck bckVar = this.f776j;
            List list = this.f767a;
            ArrayList arrayList2 = new ArrayList();
            long jLongValue = 0;
            long jMax = 0;
            int i7 = 0;
            int i8 = 1;
            while (i7 < list.size()) {
                amy amyVar2 = (amy) list.get(i7);
                if (!amyVar2.m981b().isEmpty()) {
                    MediaFormat mediaFormat = amyVar2.f759a;
                    String string = mediaFormat.getString("language");
                    boolean zM205d = acm.m205d(amyVar2.f759a);
                    boolean zM204c = acm.m204c(amyVar2.f759a);
                    ArrayList arrayList3 = arrayList2;
                    long j2 = ((MediaCodec.BufferInfo) amyVar2.m981b().get(i5)).presentationTimeUs;
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i5);
                    mws mwsVarM981b = amyVar2.m981b();
                    int iM980a = amyVar2.m980a();
                    int i9 = ((oyo) bckVar.f2949b).f46847a;
                    ArrayList arrayList4 = new ArrayList();
                    long j3 = 0;
                    int i10 = 0;
                    while (true) {
                        str2 = str4;
                        i = i7;
                        if (i10 >= mwsVarM981b.size()) {
                            j = jMin;
                            String str5 = string;
                            if (arrayList4.size() > 2) {
                                switch (i9) {
                                    case 0:
                                        arrayList4.set(arrayList4.size() - 1, (Long) arrayList4.get(arrayList4.size() - 2));
                                        i2 = 0;
                                        break;
                                    default:
                                        lku.m15613H(((Long) mkv.m16515W(arrayList4)).longValue() == 0);
                                        i2 = 0;
                                        break;
                                }
                            } else {
                                i2 = 0;
                            }
                            while (i2 < arrayList4.size()) {
                                jLongValue += ((Long) arrayList4.get(i2)).longValue();
                                i2++;
                            }
                            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                            long jM980a = (1000000 * jLongValue) / ((long) amyVar2.m980a());
                            long jM253c = acy.m253c(jM980a, 10000L);
                            amt amtVar = (amt) bckVar.f2948a;
                            byteBufferArr[0] = amr.m969d(i8, (int) jM253c, amtVar.f732d, amtVar.f729a, mediaFormat);
                            byteBufferArr[1] = byteBufferAllocate2;
                            ByteBuffer[] byteBufferArr2 = new ByteBuffer[3];
                            int iM980a2 = amyVar2.m980a();
                            long j4 = ((amt) bckVar.f2948a).f732d;
                            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(200);
                            byteBufferAllocate3.putInt(0);
                            byteBufferAllocate3.putInt(amr.m966a(j4));
                            byteBufferAllocate3.putInt(amr.m966a(j4));
                            byteBufferAllocate3.putInt(iM980a2);
                            byteBufferAllocate3.putInt((int) jLongValue);
                            if (str5 == null) {
                                i3 = 0;
                            } else {
                                byte[] bytes = str5.getBytes(mrd.f41463a);
                                if (bytes.length != 3) {
                                    throw new IllegalArgumentException("Non-length-3 language code: ".concat(str5));
                                }
                                int i11 = bytes[2] & 31;
                                int i12 = bytes[1] & 31;
                                int i13 = bytes[0] & 31;
                                lku.m15613H(true);
                                i3 = (i13 << 10) + i11 + (i12 << 5);
                            }
                            byteBufferAllocate3.putShort((short) i3);
                            byteBufferAllocate3.putShort((short) 0);
                            byteBufferAllocate3.flip();
                            byteBufferArr2[0] = acv.m242k("mdhd", byteBufferAllocate3);
                            byteBufferArr2[1] = amr.m967b(amyVar2);
                            ByteBuffer[] byteBufferArr3 = new ByteBuffer[3];
                            if (zM205d) {
                                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(200);
                                byteBufferAllocate4.putInt(0);
                                byteBufferAllocate4.putShort((short) 0);
                                byteBufferAllocate4.putShort((short) 0);
                                byteBufferAllocate4.putShort((short) 0);
                                byteBufferAllocate4.putShort((short) 0);
                                byteBufferAllocate4.flip();
                                byteBufferM242k2 = acv.m242k("vmhd", byteBufferAllocate4);
                                i4 = 0;
                            } else if (zM204c) {
                                ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(200);
                                i4 = 0;
                                byteBufferAllocate5.putInt(0);
                                byteBufferAllocate5.putShort((short) 0);
                                byteBufferAllocate5.putShort((short) 0);
                                byteBufferAllocate5.flip();
                                byteBufferM242k2 = acv.m242k("smhd", byteBufferAllocate5);
                            } else {
                                i4 = 0;
                                ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(200);
                                byteBufferAllocate6.putInt(0);
                                byteBufferAllocate6.flip();
                                byteBufferM242k2 = acv.m242k("nmhd", byteBufferAllocate6);
                            }
                            byteBufferArr3[i4] = byteBufferM242k2;
                            ByteBuffer[] byteBufferArr4 = new ByteBuffer[1];
                            ByteBuffer byteBufferAllocate7 = ByteBuffer.allocate(4);
                            byteBufferAllocate7.putInt(1);
                            byteBufferAllocate7.flip();
                            byteBufferArr4[i4] = acv.m242k("url ", byteBufferAllocate7);
                            ByteBuffer byteBufferAllocate8 = ByteBuffer.allocate(8);
                            byteBufferAllocate8.putInt(i4);
                            byteBufferAllocate8.putInt(1);
                            byteBufferAllocate8.flip();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(byteBufferAllocate8);
                            Collections.addAll(arrayList5, byteBufferArr4);
                            byteBufferArr3[1] = acv.m242k("dinf", acv.m241j("dref", arrayList5));
                            ByteBuffer[] byteBufferArr5 = new ByteBuffer[6];
                            if (zM205d) {
                                String string2 = mediaFormat.getString("mime");
                                switch (string2.hashCode()) {
                                    case -1662735862:
                                        if (string2.equals("video/av01")) {
                                            b3 = 2;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1662541442:
                                        if (string2.equals(NptsKnlVczSZ.XJniAiuUyiP)) {
                                            b3 = 1;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1331836730:
                                        if (string2.equals("video/avc")) {
                                            b3 = 0;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    case 0:
                                        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                                        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                                        byteBuffer.getClass();
                                        byteBuffer2.getClass();
                                        ByteBuffer byteBufferAllocate9 = ByteBuffer.allocate(byteBuffer.limit() + byteBuffer2.limit() + 200);
                                        byteBufferAllocate9.put((byte) 1);
                                        lku.m15670x(byteBuffer.limit() > 3, "SPS too small");
                                        byteBufferAllocate9.put(byteBuffer.get(5));
                                        byteBufferAllocate9.put(byteBuffer.get(6));
                                        byteBufferAllocate9.put(byteBuffer.get(7));
                                        byteBufferAllocate9.put((byte) -1);
                                        byteBufferAllocate9.put((byte) -31);
                                        byteBuffer.position(4);
                                        byteBufferAllocate9.putShort((short) (byteBuffer.limit() - 4));
                                        byteBufferAllocate9.put(byteBuffer);
                                        byteBuffer.rewind();
                                        byteBufferAllocate9.put((byte) 1);
                                        byteBufferAllocate9.putShort((short) (byteBuffer2.limit() - 4));
                                        byteBuffer2.position(4);
                                        byteBufferAllocate9.put(byteBuffer2);
                                        byteBuffer2.rewind();
                                        byteBufferAllocate9.flip();
                                        byteBufferM242k5 = acv.m242k("avcC", byteBufferAllocate9);
                                        break;
                                    case 1:
                                        ByteBuffer byteBuffer3 = mediaFormat.getByteBuffer("csd-0");
                                        byteBuffer3.getClass();
                                        ByteBuffer byteBufferAllocate10 = ByteBuffer.allocate(byteBuffer3.limit() + 200);
                                        List listM217c = acq.m217c(byteBuffer3);
                                        ArrayList arrayList6 = new ArrayList();
                                        for (int i14 = 0; i14 < listM217c.size(); i14++) {
                                            arrayList6.add(acq.m216b((ByteBuffer) listM217c.get(i14)));
                                        }
                                        byteBufferAllocate10.put((byte) 1);
                                        ByteBuffer byteBuffer4 = (ByteBuffer) arrayList6.get(0);
                                        if (byteBuffer4.get(byteBuffer4.position()) != 64) {
                                            throw new UnsupportedOperationException("First NALU in csr-0 is not the VPS");
                                        }
                                        byteBufferAllocate10.put(byteBuffer4.get(6));
                                        byteBufferAllocate10.putInt(byteBuffer4.getInt(7));
                                        byteBufferAllocate10.putInt(byteBuffer4.getInt(11));
                                        byteBufferAllocate10.putShort(byteBuffer4.getShort(15));
                                        byteBufferAllocate10.put(byteBuffer4.get(17));
                                        byteBufferAllocate10.putShort((short) -4096);
                                        byteBufferAllocate10.put((byte) -4);
                                        if (mediaFormat.containsKey("profile") && mediaFormat.getInteger("profile") == 2) {
                                            byteBufferAllocate10.put((byte) -3);
                                            byteBufferAllocate10.put((byte) -6);
                                            byteBufferAllocate10.put((byte) -6);
                                        } else {
                                            byteBufferAllocate10.put((byte) -4);
                                            byteBufferAllocate10.put((byte) -8);
                                            byteBufferAllocate10.put((byte) -8);
                                        }
                                        byteBufferAllocate10.putShort((short) 0);
                                        byteBufferAllocate10.put((byte) 15);
                                        byteBufferAllocate10.put((byte) listM217c.size());
                                        for (int i15 = 0; i15 < listM217c.size(); i15++) {
                                            ByteBuffer byteBuffer5 = (ByteBuffer) listM217c.get(i15);
                                            byteBufferAllocate10.put((byte) ((byteBuffer5.get(0) >> 1) & 63));
                                            byteBufferAllocate10.putShort((short) 1);
                                            byteBufferAllocate10.putShort((short) byteBuffer5.limit());
                                            byteBufferAllocate10.put(byteBuffer5);
                                        }
                                        byteBufferAllocate10.flip();
                                        byteBufferM242k5 = acv.m242k("hvcC", byteBufferAllocate10);
                                        break;
                                        break;
                                    case 2:
                                        ByteBuffer byteBuffer6 = mediaFormat.getByteBuffer("csd-0");
                                        byteBuffer6.getClass();
                                        byteBufferM242k5 = acv.m242k("av1C", byteBuffer6.duplicate());
                                        break;
                                    default:
                                        throw new UnsupportedOperationException("Unsupported video format: ".concat(String.valueOf(mediaFormat.getString("mime"))));
                                }
                                switch (mediaFormat.getString("mime")) {
                                    case "video/avc":
                                        str3 = "avc1";
                                        break;
                                    case "video/hevc":
                                        str3 = "hvc1";
                                        break;
                                    case "video/av01":
                                        str3 = "av01";
                                        break;
                                    default:
                                        throw new UnsupportedOperationException("Unsupported video format: ".concat(String.valueOf(mediaFormat.getString("mime"))));
                                }
                                ByteBuffer byteBufferAllocate11 = ByteBuffer.allocate(byteBufferM242k5.limit() + 200);
                                byteBufferAllocate11.putInt(0);
                                byteBufferAllocate11.putShort((short) 0);
                                byteBufferAllocate11.putShort((short) 1);
                                byteBufferAllocate11.putShort((short) 0);
                                byteBufferAllocate11.putShort((short) 0);
                                byteBufferAllocate11.putInt(0);
                                byteBufferAllocate11.putInt(0);
                                byteBufferAllocate11.putInt(0);
                                int integer = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : 0;
                                int integer2 = mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : 0;
                                byteBufferAllocate11.putShort((short) integer);
                                byteBufferAllocate11.putShort((short) integer2);
                                byteBufferAllocate11.putInt(4718592);
                                byteBufferAllocate11.putInt(4718592);
                                byteBufferAllocate11.putInt(0);
                                byteBufferAllocate11.putShort((short) 1);
                                byteBufferAllocate11.put((byte) 0);
                                for (int i16 = 0; i16 < 31; i16++) {
                                    byteBufferAllocate11.put((byte) 32);
                                }
                                byteBufferAllocate11.putShort((short) 24);
                                byteBufferAllocate11.putShort((short) -1);
                                byteBufferAllocate11.put(byteBufferM242k5);
                                ByteBuffer byteBufferAllocate12 = ByteBuffer.allocate(200);
                                byteBufferAllocate12.putInt(65536);
                                byteBufferAllocate12.putInt(65536);
                                byteBufferAllocate12.flip();
                                byteBufferAllocate11.put(acv.m242k(rgoX.ckIOXtqYjT, byteBufferAllocate12));
                                int iM1013a = ana.m1013a(mediaFormat, "color-standard");
                                String str6 = pIeXJQLZLfgIN.QAaj;
                                if (iM1013a == 0 && ana.m1013a(mediaFormat, "color-transfer") == 0 && ana.m1013a(mediaFormat, str6) == 0) {
                                    bckVar = bckVar;
                                } else {
                                    ByteBuffer byteBufferAllocate13 = ByteBuffer.allocate(20);
                                    byteBufferAllocate13.put((byte) 110);
                                    byteBufferAllocate13.put((byte) 99);
                                    byteBufferAllocate13.put((byte) 108);
                                    byteBufferAllocate13.put((byte) 120);
                                    if (mediaFormat.containsKey("color-standard")) {
                                        int integer3 = mediaFormat.getInteger("color-standard");
                                        if (integer3 < 0 || integer3 >= 10) {
                                            throw new IllegalArgumentException("Color standard not implemented: " + integer3);
                                        }
                                        short[] sArr = ana.f837a[integer3];
                                        short s4 = sArr[0];
                                        s2 = sArr[1];
                                        s = s4;
                                    } else {
                                        s = 0;
                                        s2 = 0;
                                    }
                                    if (mediaFormat.containsKey("color-transfer")) {
                                        int integer4 = mediaFormat.getInteger("color-transfer");
                                        if (integer4 < 0 || integer4 >= 8) {
                                            throw new IllegalArgumentException(VCYBIzY.DIRJlBhbz + integer4);
                                        }
                                        s3 = ana.f838b[integer4];
                                    } else {
                                        s3 = 0;
                                    }
                                    if (mediaFormat.containsKey(str6)) {
                                        int integer5 = mediaFormat.getInteger(str6);
                                        if (integer5 < 0 || integer5 > 2) {
                                            throw new IllegalArgumentException("Color range not implemented: " + integer5);
                                        }
                                        if (integer5 == 1) {
                                            b4 = -128;
                                        } else {
                                            b4 = 0;
                                        }
                                    } else {
                                        b4 = 0;
                                    }
                                    byteBufferAllocate13.putShort(s);
                                    byteBufferAllocate13.putShort(s3);
                                    byteBufferAllocate13.putShort(s2);
                                    byteBufferAllocate13.put(b4);
                                    byteBufferAllocate13.flip();
                                    byteBufferAllocate11.put(acv.m242k("colr", byteBufferAllocate13));
                                }
                                byteBufferAllocate11.flip();
                                byteBufferM242k3 = acv.m242k(str3, byteBufferAllocate11);
                            } else {
                                bckVar = bckVar;
                                if (zM204c) {
                                    byteBufferM242k3 = acu.m231f(mediaFormat);
                                } else {
                                    ByteBuffer byteBufferAllocate14 = ByteBuffer.allocate(200);
                                    byte[] bytes2 = mediaFormat.getString("mime").getBytes(mrd.f41463a);
                                    byteBufferAllocate14.put(bytes2);
                                    byteBufferAllocate14.put((byte) 0);
                                    byteBufferAllocate14.put(bytes2);
                                    byteBufferAllocate14.put((byte) 0);
                                    byteBufferAllocate14.flip();
                                    byteBufferM242k3 = acv.m242k("mett", byteBufferAllocate14);
                                }
                            }
                            ByteBuffer byteBufferAllocate15 = ByteBuffer.allocate(byteBufferM242k3.limit() + 200);
                            byteBufferAllocate15.putInt(0);
                            byteBufferAllocate15.putInt(1);
                            byteBufferAllocate15.put(byteBufferM242k3);
                            byteBufferAllocate15.flip();
                            byteBufferArr5[0] = acv.m242k("stsd", byteBufferAllocate15);
                            ByteBuffer byteBufferAllocate16 = ByteBuffer.allocate((arrayList4.size() * 8) + 200);
                            byteBufferAllocate16.putInt(0);
                            int iPosition = byteBufferAllocate16.position();
                            byteBufferAllocate16.putInt(0);
                            long j5 = -1;
                            int iPosition2 = -1;
                            int i17 = 0;
                            int i18 = 0;
                            while (i17 < arrayList4.size()) {
                                ByteBuffer[] byteBufferArr6 = byteBufferArr;
                                long jLongValue2 = ((Long) arrayList4.get(i17)).longValue();
                                if (j5 != jLongValue2) {
                                    iPosition2 = byteBufferAllocate16.position();
                                    byteBufferAllocate16.putInt(1);
                                    byteBufferAllocate16.putInt((int) jLongValue2);
                                    i18++;
                                    j5 = jLongValue2;
                                } else {
                                    byteBufferAllocate16.putInt(iPosition2, byteBufferAllocate16.getInt(iPosition2) + 1);
                                }
                                i17++;
                                byteBufferArr = byteBufferArr6;
                            }
                            ByteBuffer[] byteBufferArr7 = byteBufferArr;
                            byteBufferAllocate16.putInt(iPosition, i18);
                            byteBufferAllocate16.flip();
                            byteBufferArr5[1] = acv.m242k("stts", byteBufferAllocate16);
                            mws mwsVarM981b2 = amyVar2.m981b();
                            ByteBuffer byteBufferAllocate17 = ByteBuffer.allocate((mwsVarM981b2.size() * 4) + 200);
                            byteBufferAllocate17.putInt(0);
                            byteBufferAllocate17.putInt(0);
                            byteBufferAllocate17.putInt(mwsVarM981b2.size());
                            for (int i19 = 0; i19 < mwsVarM981b2.size(); i19++) {
                                byteBufferAllocate17.putInt(((MediaCodec.BufferInfo) mwsVarM981b2.get(i19)).size);
                            }
                            byteBufferAllocate17.flip();
                            byteBufferArr5[2] = acv.m242k("stsz", byteBufferAllocate17);
                            mws mwsVarM17095j = mws.m17095j(amyVar2.f763e);
                            ByteBuffer byteBufferAllocate18 = ByteBuffer.allocate((mwsVarM17095j.size() * 12) + 200);
                            byteBufferAllocate18.putInt(0);
                            byteBufferAllocate18.putInt(mwsVarM17095j.size());
                            int i20 = 1;
                            for (int i21 = 0; i21 < mwsVarM17095j.size(); i21++) {
                                int iIntValue = ((Integer) mwsVarM17095j.get(i21)).intValue();
                                byteBufferAllocate18.putInt(i20);
                                byteBufferAllocate18.putInt(iIntValue);
                                byteBufferAllocate18.putInt(1);
                                i20++;
                            }
                            byteBufferAllocate18.flip();
                            byteBufferArr5[3] = acv.m242k("stsc", byteBufferAllocate18);
                            mws mwsVarM17095j2 = mws.m17095j(amyVar2.f762d);
                            ByteBuffer byteBufferAllocate19 = ByteBuffer.allocate((mwsVarM17095j2.size() * 8) + 200);
                            byteBufferAllocate19.putInt(0);
                            byteBufferAllocate19.putInt(mwsVarM17095j2.size());
                            for (int i22 = 0; i22 < mwsVarM17095j2.size(); i22++) {
                                byteBufferAllocate19.putLong(((Long) mwsVarM17095j2.get(i22)).longValue());
                            }
                            byteBufferAllocate19.flip();
                            byteBufferArr5[4] = acv.m242k("co64", byteBufferAllocate19);
                            if (zM205d) {
                                mws mwsVarM981b3 = amyVar2.m981b();
                                ByteBuffer byteBufferAllocate20 = ByteBuffer.allocate((mwsVarM981b3.size() * 4) + 200);
                                byteBufferAllocate20.putInt(0);
                                int iPosition3 = byteBufferAllocate20.position();
                                byteBufferAllocate20.putInt(mwsVarM981b3.size());
                                int i23 = 1;
                                int i24 = 0;
                                for (int i25 = 0; i25 < mwsVarM981b3.size(); i25++) {
                                    if ((((MediaCodec.BufferInfo) mwsVarM981b3.get(i25)).flags & 1) > 0) {
                                        byteBufferAllocate20.putInt(i23);
                                        i24++;
                                    }
                                    i23++;
                                }
                                byteBufferAllocate20.putInt(iPosition3, i24);
                                byteBufferAllocate20.flip();
                                byteBufferM242k4 = acv.m242k("stss", byteBufferAllocate20);
                            } else {
                                byteBufferM242k4 = null;
                            }
                            byteBufferArr5[5] = byteBufferM242k4;
                            ArrayList arrayList7 = new ArrayList();
                            for (int i26 = 0; i26 < 6; i26++) {
                                ByteBuffer byteBuffer7 = byteBufferArr5[i26];
                                if (byteBuffer7 != null) {
                                    arrayList7.add(byteBuffer7);
                                }
                            }
                            byteBufferArr3[2] = acv.m241j("stbl", arrayList7);
                            byteBufferArr2[2] = acv.m241j("minf", Arrays.asList(byteBufferArr3));
                            byteBufferArr7[2] = acv.m241j(TVkaNXnfP.tOQaUQvjCf, Arrays.asList(byteBufferArr2));
                            arrayList = arrayList3;
                            arrayList.add(acv.m241j("trak", Arrays.asList(byteBufferArr7)));
                            jMax = Math.max(jMax, jM980a);
                            i8++;
                            break;
                        }
                        String str7 = string;
                        long j6 = ((MediaCodec.BufferInfo) mwsVarM981b.get(i10)).presentationTimeUs;
                        if (i10 != mwsVarM981b.size() - 1) {
                            j6 = ((MediaCodec.BufferInfo) mwsVarM981b.get(i10 + 1)).presentationTimeUs;
                        }
                        long j7 = jMin;
                        long jM253c2 = acy.m253c(j6 - jMin, iM980a);
                        long j8 = jM253c2 - j3;
                        if (j8 >= 2147483647L) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Timestamp delta %d doesn't fit into an int", Long.valueOf(j8)));
                        }
                        arrayList4.add(Long.valueOf(j8));
                        i10++;
                        j3 = jM253c2;
                        str4 = str2;
                        i7 = i;
                        string = str7;
                        jMin = j7;
                    }
                } else {
                    bckVar = bckVar;
                    str2 = str4;
                    j = jMin;
                    i = i7;
                    arrayList = arrayList2;
                }
                i7 = i + 1;
                arrayList2 = arrayList;
                bckVar = bckVar;
                list = list;
                str4 = str2;
                jMin = j;
                i5 = 0;
            }
            bck bckVar2 = bckVar;
            String str8 = str4;
            ArrayList arrayList8 = arrayList2;
            int i27 = i8;
            long j9 = ((amt) bckVar2.f2948a).f732d;
            ByteBuffer byteBufferAllocate21 = ByteBuffer.allocate(200);
            byteBufferAllocate21.putInt(0);
            byteBufferAllocate21.putInt(amr.m966a(j9));
            byteBufferAllocate21.putInt(amr.m966a(j9));
            byteBufferAllocate21.putInt(10000);
            byteBufferAllocate21.putInt((int) acy.m253c(jMax, 10000L));
            byteBufferAllocate21.putInt(65536);
            byteBufferAllocate21.putShort((short) 256);
            byteBufferAllocate21.putShort((short) 0);
            byteBufferAllocate21.putInt(0);
            byteBufferAllocate21.putInt(0);
            int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
            for (int i28 = 0; i28 < 9; i28++) {
                byteBufferAllocate21.putInt(iArr[i28]);
            }
            for (int i29 = 0; i29 < 6; i29++) {
                byteBufferAllocate21.putInt(0);
            }
            byteBufferAllocate21.putInt(i27);
            byteBufferAllocate21.flip();
            ByteBuffer byteBufferM242k6 = acv.m242k("mvhd", byteBufferAllocate21);
            amu amuVar = ((amt) bckVar2.f2948a).f730b;
            if (amuVar == null) {
                byteBufferM242k = ByteBuffer.allocate(0);
            } else {
                String str9 = String.format(Locale.US, "%+.4f%+.4f/", Float.valueOf(amuVar.f733a), Float.valueOf(amuVar.f734b));
                ByteBuffer byteBufferAllocate22 = ByteBuffer.allocate(str9.length() + 4);
                byteBufferAllocate22.putShort((short) (byteBufferAllocate22.capacity() - 4));
                byteBufferAllocate22.putShort((short) 5575);
                byteBufferAllocate22.put(str9.getBytes(mrd.f41463a));
                lku.m15613H(byteBufferAllocate22.limit() == byteBufferAllocate22.capacity());
                byteBufferAllocate22.flip();
                byteBufferM242k = acv.m242k("udta", acv.m243l(new byte[]{-87, 120, 121, 122}, byteBufferAllocate22));
            }
            if (((amt) bckVar2.f2948a).f731c.isEmpty()) {
                byteBufferM241j3 = ByteBuffer.allocate(0);
                str = str8;
            } else {
                ByteBuffer[] byteBufferArr8 = new ByteBuffer[3];
                ByteBuffer byteBufferAllocate23 = ByteBuffer.allocate(200);
                byteBufferAllocate23.putInt(0);
                byteBufferAllocate23.putInt(0);
                byteBufferAllocate23.put("mdta".getBytes(mrd.f41463a));
                byteBufferAllocate23.putInt(0);
                byteBufferAllocate23.putInt(0);
                byteBufferAllocate23.putInt(0);
                byteBufferAllocate23.put((byte) 0);
                byteBufferAllocate23.flip();
                str = str8;
                byteBufferArr8[0] = acv.m242k(str, byteBufferAllocate23);
                ArrayList arrayListM16499G = mkv.m16499G(((amt) bckVar2.f2948a).f731c.keySet());
                ByteBuffer byteBufferAllocate24 = ByteBuffer.allocate(200);
                byteBufferAllocate24.putInt(0);
                byteBufferAllocate24.putInt(arrayListM16499G.size());
                for (int i30 = 0; i30 < arrayListM16499G.size(); i30++) {
                    byteBufferAllocate24.put(acv.m242k("mdta", ByteBuffer.wrap(((String) arrayListM16499G.get(i30)).getBytes(mrd.f41463a))));
                }
                byteBufferAllocate24.flip();
                byteBufferArr8[1] = acv.m242k("keys", byteBufferAllocate24);
                byteBufferArr8[2] = amr.m968c(mkv.m16499G(((amt) bckVar2.f2948a).f731c.values()));
                byteBufferM241j3 = acv.m241j("meta", Arrays.asList(byteBufferArr8));
            }
            ByteBuffer byteBufferAllocate25 = ByteBuffer.allocate(0);
            ArrayList arrayList9 = new ArrayList();
            arrayList9.add(byteBufferM242k6);
            arrayList9.add(byteBufferM242k);
            arrayList9.add(byteBufferM241j3);
            arrayList9.addAll(arrayList8);
            arrayList9.add(byteBufferAllocate25);
            byteBufferAllocate = acv.m241j("moov", arrayList9);
            b = 0;
        } else {
            str = "hdlr";
            b = 0;
            byteBufferAllocate = ByteBuffer.allocate(0);
        }
        mca mcaVar = this.f777k;
        if (mcaVar.f39921i.isEmpty()) {
            byteBufferM241j2 = ByteBuffer.allocate(b);
        } else {
            ByteBuffer[] byteBufferArr9 = new ByteBuffer[7];
            ByteBuffer byteBufferAllocate26 = ByteBuffer.allocate(200);
            byteBufferAllocate26.putInt(b);
            byteBufferAllocate26.putInt(b);
            byteBufferAllocate26.put("pict".getBytes(mrd.f41463a));
            byteBufferAllocate26.putInt(b);
            byteBufferAllocate26.putInt(b);
            byteBufferAllocate26.putInt(b);
            byteBufferAllocate26.put(b);
            byteBufferAllocate26.flip();
            byteBufferArr9[b] = acv.m242k(str, byteBufferAllocate26);
            byteBufferArr9[1] = ByteBuffer.allocate(b);
            ?? r0 = mcaVar.f39921i;
            ?? r5 = mcaVar.f39913a;
            ?? r6 = mcaVar.f39917e;
            ?? r7 = mcaVar.f39920h;
            ByteBuffer byteBufferAllocate27 = ByteBuffer.allocate((r0.size() * 16) + 200);
            int i31 = 0;
            while (true) {
                if (i31 >= r5.size()) {
                    b2 = 0;
                } else if (((Integer) r5.get(i31)).equals(0)) {
                    i31++;
                } else {
                    b2 = 1;
                }
            }
            byteBufferAllocate27.put(b2);
            byteBufferAllocate27.put((byte) 0);
            byteBufferAllocate27.put((byte) 0);
            byteBufferAllocate27.put((byte) 0);
            byteBufferAllocate27.put((byte) 68);
            byteBufferAllocate27.put((byte) 0);
            if (r0.size() != r6.size()) {
                throw new IllegalArgumentException("Items size " + r0.size() + qQLA.KrCMPlGueivQlwx + r6.size());
            }
            if (r6.size() != r7.size()) {
                throw new IllegalArgumentException("Offsets size " + r6.size() + KMNlNMe.rAxxSswW + r7.size());
            }
            byteBufferAllocate27.putShort((short) r0.size());
            for (int i32 = 0; i32 < r0.size(); i32++) {
                byteBufferAllocate27.putShort((short) ((Integer) r0.get(i32)).intValue());
                if (b2 > 0) {
                    byteBufferAllocate27.putShort(((Integer) r5.get(i32)).shortValue());
                }
                byteBufferAllocate27.putShort((short) 0);
                byteBufferAllocate27.putShort((short) 1);
                byteBufferAllocate27.putInt((int) ((Long) r6.get(i32)).longValue());
                byteBufferAllocate27.putInt((int) ((Long) r7.get(i32)).longValue());
            }
            byteBufferAllocate27.flip();
            byteBufferArr9[2] = acv.m242k("iloc", byteBufferAllocate27);
            ByteBuffer[] byteBufferArr10 = new ByteBuffer[2];
            byteBufferArr10[0] = acv.m241j("ipco", mcaVar.f39918f);
            ?? r8 = mcaVar.f39921i;
            ?? r9 = mcaVar.f39916d;
            ByteBuffer byteBufferAllocate28 = ByteBuffer.allocate(200);
            byteBufferAllocate28.putInt(0);
            if (r8.size() != r9.size()) {
                throw new IllegalArgumentException("From ids count " + r8.size() + yTyWiTtGtnBhy.CUNbuQrOssdnE + r9.size());
            }
            int i33 = 0;
            for (int i34 = 0; i34 < r9.size(); i34++) {
                if (!((List) r9.get(i34)).isEmpty()) {
                    i33++;
                }
            }
            byteBufferAllocate28.putInt(i33);
            for (int i35 = 0; i35 < r8.size(); i35++) {
                if (!((List) r9.get(i35)).isEmpty()) {
                    byteBufferAllocate28.putShort((short) ((Integer) r8.get(i35)).intValue());
                    List list2 = (List) r9.get(i35);
                    if (list2.size() > 127) {
                        throw new IllegalArgumentException("Too many properties");
                    }
                    byteBufferAllocate28.put((byte) list2.size());
                    for (int i36 = 0; i36 < list2.size(); i36++) {
                        int iIntValue2 = ((Integer) list2.get(i36)).intValue();
                        if (iIntValue2 > 255) {
                            throw new IllegalArgumentException("Association does not fit into byte");
                        }
                        byteBufferAllocate28.put((byte) iIntValue2);
                    }
                }
            }
            byteBufferAllocate28.flip();
            byteBufferArr10[1] = acv.m242k("ipma", byteBufferAllocate28);
            ArrayList arrayList10 = new ArrayList();
            Collections.addAll(arrayList10, byteBufferArr10);
            byteBufferArr9[3] = acv.m241j("iprp", arrayList10);
            ?? r1 = mcaVar.f39915c;
            ByteBuffer byteBufferAllocate29 = ByteBuffer.allocate(200);
            byteBufferAllocate29.putInt(0);
            byteBufferAllocate29.putShort((short) r1.size());
            for (int i37 = 0; i37 < r1.size(); i37++) {
                byteBufferAllocate29.put((ByteBuffer) r1.get(i37));
            }
            byteBufferAllocate29.flip();
            byteBufferArr9[4] = acv.m242k("iinf", byteBufferAllocate29);
            if (mcaVar.f39914b.isEmpty()) {
                byteBufferM241j = ByteBuffer.allocate(0);
            } else {
                Object obj = mcaVar.f39914b;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(ByteBuffer.allocate(4));
                arrayList11.addAll(obj);
                byteBufferM241j = acv.m241j(VCYBIzY.ysAIJsrv, arrayList11);
            }
            byteBufferArr9[5] = byteBufferM241j;
            byteBufferArr9[6] = mcaVar.f39919g.isEmpty() ? ByteBuffer.allocate(0) : acv.m241j("idat", mcaVar.f39919g);
            ArrayList arrayList12 = new ArrayList();
            arrayList12.add(ByteBuffer.allocate(4));
            Collections.addAll(arrayList12, byteBufferArr9);
            byteBufferM241j2 = acv.m241j("meta", arrayList12);
        }
        if (byteBufferM241j2.remaining() <= 0) {
            return byteBufferAllocate;
        }
        ByteBuffer byteBufferAllocate30 = ByteBuffer.allocate(byteBufferAllocate.remaining() + byteBufferM241j2.remaining());
        byteBufferAllocate30.put(byteBufferAllocate);
        byteBufferAllocate30.put(byteBufferM241j2);
        byteBufferAllocate30.flip();
        return byteBufferAllocate30;
    }

    /* JADX INFO: renamed from: c */
    private final void m983c(long j, ByteBuffer byteBuffer) throws IOException {
        lku.m15613H(j >= ((Long) this.f775i.m17181j()).longValue());
        lku.m15613H(j >= this.f774h);
        this.f771e.position(j);
        this.f771e.write(acv.m242k("free", byteBuffer.duplicate()));
        this.f774h = 8 + j;
        m984d();
        this.f775i = mzj.m17175e(Long.valueOf(j), Long.valueOf(j + ((long) byteBuffer.limit())));
    }

    /* JADX INFO: renamed from: d */
    private final void m984d() throws IOException {
        this.f771e.position(this.f772f + 8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(this.f774h - this.f772f);
        byteBufferAllocate.flip();
        this.f771e.write(byteBufferAllocate);
    }

    /* JADX INFO: renamed from: a */
    public final void m985a(amy amyVar) throws IOException {
        if (amyVar.f764f.isEmpty()) {
            return;
        }
        if (!this.f768b.getAndSet(true)) {
            this.f771e.position(0L);
            this.f771e.write(this.f769c.m970a());
            this.f772f = this.f771e.position();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            byteBufferAllocate.putInt(1);
            byteBufferAllocate.put("mdat".getBytes(mrd.f41463a));
            byteBufferAllocate.putLong(16L);
            byteBufferAllocate.flip();
            this.f771e.write(byteBufferAllocate);
            long j = this.f772f + 16;
            this.f773g = j;
            this.f774h = j;
        }
        Iterator it = amyVar.f764f.iterator();
        long jLimit = 0;
        while (it.hasNext()) {
            jLimit += (long) ((ByteBuffer) ((Pair) it.next()).second).limit();
        }
        lku.m15613H(jLimit > 0);
        long j2 = this.f773g;
        if (j2 + jLimit >= this.f774h) {
            m983c(Math.max(this.f774h + Math.max(500000L, (long) (j2 * 0.2f)) + jLimit, ((Long) this.f775i.m17181j()).longValue()), m982b());
        }
        amyVar.f762d.add(Long.valueOf(this.f773g));
        amyVar.f763e.add(Integer.valueOf(amyVar.f764f.size()));
        do {
            Pair pair = (Pair) amyVar.f764f.removeFirst();
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) pair.first;
            ByteBuffer byteBuffer = (ByteBuffer) pair.second;
            amyVar.f761c.add(bufferInfo);
            if (acm.m205d(amyVar.f759a)) {
                int i = AnnexBToAvcc.f1537a;
                lku.m15670x(byteBuffer.isDirect(), "Conversion only works with direct ByteBuffers");
                AnnexBToAvcc.processNative(byteBuffer, byteBuffer.limit());
            }
            byteBuffer.rewind();
            long j3 = this.f773g;
            this.f773g = j3 + ((long) this.f771e.write(byteBuffer, j3));
        } while (!amyVar.f764f.isEmpty());
        lku.m15613H(this.f773g <= this.f774h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.amw, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = 0;
        while (true) {
            try {
                if (i >= this.f767a.size()) {
                    break;
                }
                m985a((amy) this.f767a.get(i));
                i++;
            } finally {
                this.f771e.close();
                this.f770d.close();
                this.f771e = null;
                this.f770d = null;
            }
        }
        if (this.f768b.get()) {
            ByteBuffer byteBufferM982b = m982b();
            int iLimit = byteBufferM982b.limit();
            long j = iLimit + 8;
            if (this.f774h - this.f773g < j) {
                m983c(((Long) this.f775i.m17181j()).longValue() + j, byteBufferM982b);
                lku.m15613H(this.f774h - this.f773g >= j);
            }
            long j2 = this.f773g;
            this.f771e.position(j2);
            this.f771e.write(byteBufferM982b);
            long j3 = ((long) iLimit) + j2;
            long jLongValue = ((Long) this.f775i.m17181j()).longValue() - j3;
            lku.m15613H(jLongValue < 2147483647L);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt((int) jLongValue);
            byteBufferAllocate.put((byte) 102);
            byteBufferAllocate.put((byte) 114);
            byteBufferAllocate.put((byte) 101);
            byteBufferAllocate.put((byte) 101);
            byteBufferAllocate.flip();
            this.f771e.write(byteBufferAllocate);
            this.f774h = j2;
            m984d();
            this.f775i = mzj.m17175e(Long.valueOf(j2), Long.valueOf(j2 + ((long) byteBufferM982b.limit())));
            this.f771e.truncate(j3);
        }
    }
}
