package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.imax.cyclops.audio.AudioTrack;
import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;
import com.google.android.apps.camera.imax.cyclops.metadata.PanoMeta;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.p019io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eit implements gqs {

    /* JADX INFO: renamed from: b */
    private static final nbh f14174b = nbh.m17259h("com/google/android/apps/camera/imax/ImaxProcessingTask");

    /* JADX INFO: renamed from: a */
    public final gyh f14175a;

    /* JADX INFO: renamed from: c */
    private final boolean f14176c;

    /* JADX INFO: renamed from: d */
    private final ekj f14177d = (ekj) ekv.m7427a(ekj.class);

    /* JADX INFO: renamed from: e */
    private final ekw f14178e = (ekw) ekv.m7427a(ekw.class);

    /* JADX INFO: renamed from: f */
    private final cjr f14179f;

    /* JADX INFO: renamed from: g */
    private final dhv f14180g;

    /* JADX INFO: renamed from: h */
    private final List f14181h;

    /* JADX INFO: renamed from: i */
    private final kbz f14182i;

    /* JADX INFO: renamed from: j */
    private final boolean f14183j;

    /* JADX INFO: renamed from: k */
    private final eij f14184k;

    /* JADX INFO: renamed from: l */
    private final jfs f14185l;

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v3, types: [gwx, java.lang.Object] */
    public eit(jfs jfsVar, gxa gxaVar, jfs jfsVar2, kbz kbzVar, fca fcaVar, jww jwwVar, dhv dhvVar, kqj kqjVar, eij eijVar, Bitmap bitmap, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        Bitmap bitmapCreateBitmap;
        this.f14184k = eijVar;
        this.f14176c = ((Boolean) jwwVar.mo3831be()).booleanValue();
        dhw dhwVar = die.f11473a;
        this.f14181h = new ArrayList();
        this.f14182i = kbzVar;
        cjr cjrVarMo8116b = fcaVar.mo8116b();
        this.f14179f = cjrVarMo8116b;
        this.f14185l = jfsVar2;
        this.f14183j = z;
        this.f14180g = dhvVar;
        gxo gxoVar = new gxo(jfsVar.f33914a.get(), String.valueOf(eijVar.f14143a).concat(".vr"), cjrVarMo8116b, kqjVar.m14704f(System.currentTimeMillis(), dzk.PANORAMA, "PANO"));
        this.f14175a = gxoVar;
        if (z) {
            Matrix matrix = new Matrix();
            matrix.postRotate(270.0f);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } else {
            bitmapCreateBitmap = bitmap;
        }
        int i = true != z ? 0 : 270;
        kbzVar.mo13963g("imaxProcessing#startSession");
        gxaVar.mo9925e(gxoVar);
        gxoVar.mo9887S(kbc.m13903h(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()));
        gxoVar.mo9892X(bitmapCreateBitmap, i);
        gxoVar.mo9885Q(jvh.m13548F(C0100R.string.processing_panorama, new Object[0]));
        kbzVar.mo13962f();
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gqr mo7363a() {
        return this.f14175a;
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: b */
    public final String mo7364b() {
        return "ImaxProcessingTask-".concat(String.valueOf(String.valueOf(this.f14175a.mo9902h())));
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: c */
    public final void mo7365c(kao kaoVar) {
        kaoVar.getClass();
        this.f14181h.add(kaoVar);
    }

    /* JADX WARN: Code duplicated, block: B:258:0x0527 A[LOOP:0: B:257:0x0525->B:258:0x0527, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x0535  */
    /* JADX WARN: Code duplicated, block: B:292:0x05a0 A[LOOP:5: B:291:0x059e->B:292:0x05a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x05ac A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:298:0x05be A[LOOP:6: B:297:0x05bc->B:298:0x05be, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.gqs
    /* JADX INFO: renamed from: d */
    public final void mo7366d(Context context) throws Throwable {
        nqw nqwVar;
        Throwable th;
        nqw nqwVar2;
        mws mwsVarM17095j;
        int size;
        Exception exc;
        mws mwsVarM17095j2;
        int size2;
        File file;
        nqw nqwVar3;
        StereoPanorama stereoPanorama;
        IOException iOException;
        ExifInterface exifInterface;
        boolean z;
        FileInputStream fileInputStream;
        ken kenVar;
        String string;
        IOException e;
        String strM14049d;
        AudioTrack audioTrack;
        MediaFormat trackFormat;
        int i;
        Throwable th2;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        mws mwsVarM17095j3;
        int size3;
        int i2;
        File file2;
        File[] fileArrListFiles;
        eit eitVar = this;
        Object obj = "mime";
        nqw nqwVar4 = new nqw(new eis(eitVar));
        int i3 = 0;
        try {
            try {
                if (!nqw.f44094a && nqwVar4.f44096c == null) {
                    Looper looper = nqwVar4.f44097d;
                    if (looper == null) {
                        HandlerThread handlerThread = new HandlerThread("ProgressInterpolatorThread", 0);
                        handlerThread.start();
                        looper = handlerThread.getLooper();
                    }
                    nqwVar4.f44097d = looper;
                    nqwVar4.f44096c = new nqv(nqwVar4.f44095b, nqwVar4.f44097d);
                    nqv nqvVar = nqwVar4.f44096c;
                    nqvVar.f44093c = 0.0f;
                    nqvVar.m17626a();
                    nqw.f44094a = true;
                }
                nqwVar4.setRange(0.0f, 0.35f);
                if (eitVar.f14177d.computePose(eitVar.f14184k.m7357a(), nqwVar4)) {
                    if (eitVar.f14176c) {
                        nqwVar4.setRange(0.35f, 0.93f);
                    } else {
                        nqwVar4.setRange(0.35f, 0.96f);
                    }
                    eitVar.f14182i.mo13961e("imaxProcessing#getStitchedPano");
                    ekz ekzVar = new ekz(eitVar.f14184k, eitVar.f14180g.mo6184l(die.f11474b), ((Float) eitVar.f14180g.mo6180h(die.f11475c).get()).floatValue(), ((Float) eitVar.f14180g.mo6180h(die.f11476d).get()).floatValue());
                    ekzVar.f14528c = eitVar.f14183j;
                    AtomicReference atomicReference = new AtomicReference();
                    Thread thread = new Thread(new eky(ekzVar, atomicReference, nqwVar4), "OfflineOmnistereoStitchThread");
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e2) {
                        ((nbe) ((nbe) ((nbe) ekz.f14526a.m17251b()).mo17283h(e2)).mo17276G((char) 1553)).mo17293r("%s", e2.getMessage());
                    }
                    StereoPanorama stereoPanorama2 = (StereoPanorama) atomicReference.get();
                    eitVar.f14182i.mo13962f();
                    if (stereoPanorama2 == null) {
                        nqwVar = nqwVar4;
                        z = false;
                    } else {
                        nqwVar4.setRange(0.0f, 1.0f);
                        if (eitVar.f14176c) {
                            eitVar.f14182i.mo13961e("imaxProcessing#addAudio");
                            File cacheDir = context.getCacheDir();
                            String strM7358b = eitVar.f14184k.m7358b();
                            try {
                                File fileCreateTempFile = File.createTempFile("demuxed", "mp4", cacheDir);
                                String absolutePath = fileCreateTempFile.getAbsolutePath();
                                MediaExtractor mediaExtractor = new MediaExtractor();
                                try {
                                    mediaExtractor.setDataSource(strM7358b);
                                    int trackCount = mediaExtractor.getTrackCount();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= trackCount) {
                                            i4 = -1;
                                            break;
                                        } else if (mediaExtractor.getTrackFormat(i4).getString("mime").startsWith(DNTdN.oKaQvcvmPwH)) {
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (i4 < 0) {
                                        ((nbe) ((nbe) ekl.f14465a.m17251b()).mo17276G((char) 1540)).mo17293r("No video track found in %s", strM7358b);
                                        trackFormat = null;
                                    } else {
                                        mediaExtractor.selectTrack(i4);
                                        trackFormat = mediaExtractor.getTrackFormat(i4);
                                    }
                                } catch (IOException e3) {
                                    ((nbe) ((nbe) ekl.f14465a.m17251b()).mo17276G((char) 1541)).mo17293r("Could not open video file %s", strM7358b);
                                    trackFormat = null;
                                }
                                if (trackFormat == null) {
                                    ((nbe) ((nbe) ekl.f14465a.m17251b()).mo17276G((char) 1539)).mo17293r("Could not extract MediaFormat from %s", strM7358b);
                                    trackFormat = null;
                                } else {
                                    elg elgVar = new elg(absolutePath, 1);
                                    int iM7448a = elgVar.m7448a(trackFormat);
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    int i5 = 2048;
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
                                    while (true) {
                                        int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, i3);
                                        if (sampleData <= 0) {
                                            break;
                                        }
                                        if (sampleData == i5) {
                                            try {
                                                ((nbe) ((nbe) ekl.f14465a.m17251b()).mo17276G((char) 1538)).mo17290o("Chunk size is the maximum size, we probably clamped the sample");
                                                i = 2048;
                                            } catch (Exception e4) {
                                                e = e4;
                                                nqwVar = nqwVar4;
                                                i3 = 0;
                                                exc = e;
                                                ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(exc)).mo17276G(1498)).mo17290o("Failed to compute panorama");
                                                nqwVar.m17627a();
                                                mwsVarM17095j2 = mws.m17095j(eitVar.f14181h);
                                                size2 = mwsVarM17095j2.size();
                                                while (i3 < size2) {
                                                    ((kao) mwsVarM17095j2.get(i3)).mo3483a(eitVar);
                                                    i3++;
                                                }
                                                return;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj = nqwVar4;
                                                i3 = 0;
                                                th = th;
                                                nqwVar2 = obj;
                                                nqwVar2.m17627a();
                                                mwsVarM17095j = mws.m17095j(eitVar.f14181h);
                                                size = mwsVarM17095j.size();
                                                while (i3 < size) {
                                                    ((kao) mwsVarM17095j.get(i3)).mo3483a(eitVar);
                                                    i3++;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = sampleData;
                                        }
                                        bufferInfo.set(0, i, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                                        elgVar.m7450c(iM7448a, byteBufferAllocate, bufferInfo);
                                        mediaExtractor.advance();
                                        i3 = 0;
                                        i5 = 2048;
                                    }
                                    mediaExtractor.release();
                                    elgVar.m7449b();
                                }
                                if (trackFormat == null) {
                                    audioTrack = null;
                                } else {
                                    int length = (int) fileCreateTempFile.length();
                                    byte[] bArr = new byte[length];
                                    try {
                                        fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                        int i6 = 0;
                                        while (i6 < length) {
                                            try {
                                                int i7 = fileInputStream3.read(bArr, i6, length - i6);
                                                if (i7 < 0) {
                                                    break;
                                                } else {
                                                    i6 += i7;
                                                }
                                            } catch (IOException e5) {
                                                if (fileInputStream3 != null) {
                                                    try {
                                                        fileInputStream3.close();
                                                        bArr = null;
                                                    } catch (IOException e6) {
                                                        bArr = null;
                                                    }
                                                } else {
                                                    bArr = null;
                                                }
                                            } catch (Throwable th4) {
                                                th2 = th4;
                                                fileInputStream2 = fileInputStream3;
                                                if (fileInputStream2 == null) {
                                                    throw th2;
                                                }
                                                try {
                                                    fileInputStream2.close();
                                                    throw th2;
                                                } catch (IOException e7) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                        try {
                                            fileInputStream3.close();
                                        } catch (IOException e8) {
                                        }
                                    } catch (IOException e9) {
                                        fileInputStream3 = null;
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        fileInputStream2 = null;
                                    }
                                    fileCreateTempFile.delete();
                                    audioTrack = bArr == null ? null : new AudioTrack(trackFormat.getString("mime"), bArr);
                                }
                            } catch (IOException e10) {
                                audioTrack = null;
                            }
                            byte[] bArr2 = stereoPanorama2.f6738a;
                            StereoPanorama stereoPanorama3 = new StereoPanorama(bArr2, eitVar.f14183j ? bArr2 : stereoPanorama2.f6739b, stereoPanorama2.f6740c, audioTrack);
                            eitVar.f14182i.mo13962f();
                            nqwVar4.setProgress(0.96f);
                            stereoPanorama2 = stereoPanorama3;
                        }
                        nqwVar4.setRange(0.96f, 1.0f);
                        eitVar.f14182i.mo13961e("imaxProcessing#writePano");
                        eij eijVar = eitVar.f14184k;
                        File file3 = new File(eijVar.m7357a() + File.separator + eijVar.f14143a + ".vr.jpg");
                        if (eitVar.f14183j) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                try {
                                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel()).write(ByteBuffer.wrap(stereoPanorama2.f6738a));
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Throwable th6) {
                                    try {
                                        fileOutputStream.close();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                        throw th6;
                                    }
                                }
                            } catch (IOException e11) {
                                ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(e11)).mo17276G((char) 1501)).mo17290o("Failed to write file.");
                            }
                        } else {
                            eitVar.f14178e.mo7429a(stereoPanorama2, file3.getPath(), nqwVar4);
                        }
                        String path = file3.getPath();
                        try {
                            try {
                                ExifInterface exifInterface2 = new ExifInterface();
                                exifInterface2.readExif(path);
                                kep kepVar = new kep(exifInterface2);
                                if (eitVar.f14179f.m3829b().mo16813g()) {
                                    try {
                                        kepVar.m14068d((Location) eitVar.f14179f.m3829b().mo16809c());
                                    } catch (IOException e12) {
                                        iOException = e12;
                                        file = file3;
                                        nqwVar3 = nqwVar4;
                                        stereoPanorama = stereoPanorama2;
                                        i3 = 0;
                                        try {
                                            ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(iOException)).mo17276G((char) 1497)).mo17290o("Could not read exif data");
                                            exifInterface = null;
                                            eitVar = this;
                                            eitVar.f14182i.mo13962f();
                                            nqwVar = nqwVar3;
                                            try {
                                                nqwVar.setProgress(1.0f);
                                                try {
                                                    fileInputStream = new FileInputStream(file);
                                                    try {
                                                        byte[] byteArray = ByteStreams.toByteArray(fileInputStream);
                                                        gyh gyhVar = eitVar.f14175a;
                                                        PanoMeta panoMeta = stereoPanorama.f6740c;
                                                        new kbc(panoMeta.croppedAreaImageWidthPixels, panoMeta.croppedAreaImageHeightPixels);
                                                        hln hlnVar = new hln(krd.JPEG);
                                                        hlnVar.m10447a(exifInterface);
                                                        hlnVar.m10448b(kay.CLOCKWISE_0);
                                                        gyhVar.mo9912r(byteArray, hlnVar);
                                                        fileInputStream.close();
                                                        z = true;
                                                    } catch (Throwable th8) {
                                                        try {
                                                            fileInputStream.close();
                                                            throw th8;
                                                        } catch (Throwable th9) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th8, th9);
                                                            throw th8;
                                                        }
                                                    }
                                                } catch (FileNotFoundException e13) {
                                                    ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(e13)).mo17276G((char) 1499)).mo17290o(VCYBIzY.mMxDoWi);
                                                    z = true;
                                                } catch (IOException e14) {
                                                    ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(e14)).mo17276G((char) 1500)).mo17290o("Unable to read file for saving");
                                                    z = true;
                                                }
                                                nqwVar.m17627a();
                                                mwsVarM17095j3 = mws.m17095j(eitVar.f14181h);
                                                size3 = mwsVarM17095j3.size();
                                                for (i2 = 0; i2 < size3; i2++) {
                                                    ((kao) mwsVarM17095j3.get(i2)).mo3483a(eitVar);
                                                }
                                                if (z) {
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                exc = e;
                                                ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(exc)).mo17276G(1498)).mo17290o("Failed to compute panorama");
                                                nqwVar.m17627a();
                                                mwsVarM17095j2 = mws.m17095j(eitVar.f14181h);
                                                size2 = mwsVarM17095j2.size();
                                                while (i3 < size2) {
                                                    ((kao) mwsVarM17095j2.get(i3)).mo3483a(eitVar);
                                                    i3++;
                                                }
                                                return;
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            eitVar = this;
                                            nqwVar = nqwVar3;
                                            exc = e;
                                            ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(exc)).mo17276G(1498)).mo17290o("Failed to compute panorama");
                                            nqwVar.m17627a();
                                            mwsVarM17095j2 = mws.m17095j(eitVar.f14181h);
                                            size2 = mwsVarM17095j2.size();
                                            while (i3 < size2) {
                                                ((kao) mwsVarM17095j2.get(i3)).mo3483a(eitVar);
                                                i3++;
                                            }
                                            return;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            eitVar = this;
                                            obj = nqwVar3;
                                            th = th;
                                            nqwVar2 = obj;
                                            nqwVar2.m17627a();
                                            mwsVarM17095j = mws.m17095j(eitVar.f14181h);
                                            size = mwsVarM17095j.size();
                                            while (i3 < size) {
                                                ((kao) mwsVarM17095j.get(i3)).mo3483a(eitVar);
                                                i3++;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                kepVar.m14069e();
                                kepVar.m14071g(System.currentTimeMillis());
                                ExifInterface exifInterface3 = kepVar.f35783a;
                                eitVar.f14185l.m13108n(exifInterface3);
                                String tagStringValue = exifInterface3.getTagStringValue(ExifInterface.f7899h);
                                String tagStringValue2 = exifInterface3.getTagStringValue(ExifInterface.f7898g);
                                String strM13894b = kaz.m13894b(exifInterface3.m4692u(ExifInterface.f7833aT));
                                String strM13894b2 = kaz.m13894b(exifInterface3.m4692u(ExifInterface.f7835aV));
                                String tagStringValue3 = exifInterface3.getTagStringValue(ExifInterface.f7832aS);
                                String tagStringValue4 = exifInterface3.getTagStringValue(ExifInterface.f7834aU);
                                String strM13894b3 = kaz.m13894b(exifInterface3.m4692u(ExifInterface.f7837aX));
                                ken kenVarM4686k = exifInterface3.m4686k(ExifInterface.f7836aW);
                                kaz[] kazVarArrM4692u = exifInterface3.m4692u(ExifInterface.f7838aY);
                                if (kazVarArrM4692u != null) {
                                    stereoPanorama = stereoPanorama2;
                                    try {
                                        file = file3;
                                        if (kazVarArrM4692u.length != 3) {
                                            nqwVar3 = nqwVar4;
                                            kenVar = kenVarM4686k;
                                            string = null;
                                        } else {
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                int i8 = 0;
                                                while (true) {
                                                    nqwVar3 = nqwVar4;
                                                    try {
                                                        try {
                                                            int length2 = kazVarArrM4692u.length;
                                                            if (i8 >= length2) {
                                                                break;
                                                            }
                                                            kaz kazVar = kazVarArrM4692u[i8];
                                                            ken kenVar2 = kenVarM4686k;
                                                            kaz[] kazVarArr = kazVarArrM4692u;
                                                            long j = kazVar.f35505b != 1 ? 0L : kazVar.f35504a;
                                                            if (j <= 9) {
                                                                sb.append("0");
                                                            }
                                                            sb.append(j);
                                                            if (i8 != length2 - 1) {
                                                                sb.append(":");
                                                            }
                                                            i8++;
                                                            nqwVar4 = nqwVar3;
                                                            kenVarM4686k = kenVar2;
                                                            kazVarArrM4692u = kazVarArr;
                                                        } catch (IOException e17) {
                                                            e = e17;
                                                            iOException = e;
                                                            i3 = 0;
                                                            ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(iOException)).mo17276G((char) 1497)).mo17290o("Could not read exif data");
                                                            exifInterface = null;
                                                        }
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                        i3 = 0;
                                                        eitVar = this;
                                                        exc = e;
                                                        nqwVar = nqwVar3;
                                                        ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(exc)).mo17276G(1498)).mo17290o("Failed to compute panorama");
                                                        nqwVar.m17627a();
                                                        mwsVarM17095j2 = mws.m17095j(eitVar.f14181h);
                                                        size2 = mwsVarM17095j2.size();
                                                        while (i3 < size2) {
                                                            ((kao) mwsVarM17095j2.get(i3)).mo3483a(eitVar);
                                                            i3++;
                                                        }
                                                        return;
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        i3 = 0;
                                                        eitVar = this;
                                                        th = th;
                                                        nqwVar2 = nqwVar3;
                                                        nqwVar2.m17627a();
                                                        mwsVarM17095j = mws.m17095j(eitVar.f14181h);
                                                        size = mwsVarM17095j.size();
                                                        while (i3 < size) {
                                                            ((kao) mwsVarM17095j.get(i3)).mo3483a(eitVar);
                                                            i3++;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                kenVar = kenVarM4686k;
                                                string = sb.toString();
                                            } catch (IOException e19) {
                                                e = e19;
                                                nqwVar3 = nqwVar4;
                                                iOException = e;
                                                i3 = 0;
                                                ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(iOException)).mo17276G((char) 1497)).mo17290o("Could not read exif data");
                                                exifInterface = null;
                                            }
                                        }
                                    } catch (IOException e20) {
                                        e = e20;
                                        file = file3;
                                    }
                                } else {
                                    file = file3;
                                    nqwVar3 = nqwVar4;
                                    stereoPanorama = stereoPanorama2;
                                    kenVar = kenVarM4686k;
                                    string = null;
                                }
                                try {
                                    String tagStringValue5 = exifInterface3.getTagStringValue(ExifInterface.f7887bs);
                                    String tagStringValue6 = exifInterface3.getTagStringValue(ExifInterface.f7910s);
                                    String tagStringValue7 = exifInterface3.getTagStringValue(ExifInterface.f7826aM);
                                    String tagStringValue8 = exifInterface3.getTagStringValue(ExifInterface.f7843ad);
                                    android.media.ExifInterface exifInterface4 = new android.media.ExifInterface(path);
                                    if (tagStringValue != null) {
                                        exifInterface4.setAttribute("Model", tagStringValue);
                                    }
                                    if (tagStringValue2 != null) {
                                        exifInterface4.setAttribute(voNZjxiJou.qegjhxbbZWUJdfg, tagStringValue2);
                                    }
                                    if (strM13894b != null) {
                                        exifInterface4.setAttribute("GPSLatitude", strM13894b);
                                    }
                                    if (strM13894b2 != null) {
                                        exifInterface4.setAttribute("GPSLongitude", strM13894b2);
                                    }
                                    if (tagStringValue3 != null) {
                                        exifInterface4.setAttribute("GPSLatitudeRef", tagStringValue3);
                                    }
                                    if (tagStringValue4 != null) {
                                        exifInterface4.setAttribute("GPSLongitudeRef", tagStringValue4);
                                    }
                                    if (string != null) {
                                        exifInterface4.setAttribute("GPSTimeStamp", string);
                                    }
                                    if (tagStringValue5 != null) {
                                        exifInterface4.setAttribute("GPSDateStamp", tagStringValue5);
                                    }
                                    if (strM13894b3 != null) {
                                        exifInterface4.setAttribute("GPSAltitude", strM13894b3);
                                    }
                                    if (kenVar == null || !kenVar.m14050e()) {
                                        i3 = 0;
                                    } else {
                                        ken kenVar3 = kenVar;
                                        Object obj2 = kenVar3.f35770f;
                                        byte[] bArr3 = obj2 instanceof byte[] ? (byte[]) obj2 : null;
                                        if (bArr3 == null || bArr3.length <= 0) {
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            try {
                                                if (bArr3[0] != -1 && (strM14049d = kenVar3.m14049d()) != null) {
                                                    exifInterface4.setAttribute("GPSAltitudeRef", strM14049d);
                                                }
                                            } catch (IOException e21) {
                                                e = e21;
                                                iOException = e;
                                                ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(iOException)).mo17276G((char) 1497)).mo17290o("Could not read exif data");
                                                exifInterface = null;
                                            } catch (Exception e22) {
                                                e = e22;
                                                eitVar = this;
                                                exc = e;
                                                nqwVar = nqwVar3;
                                                ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(exc)).mo17276G(1498)).mo17290o("Failed to compute panorama");
                                                nqwVar.m17627a();
                                                mwsVarM17095j2 = mws.m17095j(eitVar.f14181h);
                                                size2 = mwsVarM17095j2.size();
                                                while (i3 < size2) {
                                                    ((kao) mwsVarM17095j2.get(i3)).mo3483a(eitVar);
                                                    i3++;
                                                }
                                                return;
                                            } catch (Throwable th12) {
                                                th = th12;
                                                eitVar = this;
                                                th = th;
                                                nqwVar2 = nqwVar3;
                                                nqwVar2.m17627a();
                                                mwsVarM17095j = mws.m17095j(eitVar.f14181h);
                                                size = mwsVarM17095j.size();
                                                while (i3 < size) {
                                                    ((kao) mwsVarM17095j.get(i3)).mo3483a(eitVar);
                                                    i3++;
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    if (tagStringValue6 != null) {
                                        exifInterface4.setAttribute("DateTime", tagStringValue6);
                                        exifInterface4.setAttribute("DateTimeOriginal", tagStringValue6);
                                        exifInterface4.setAttribute("DateTimeDigitized", tagStringValue6);
                                    }
                                    if (tagStringValue7 != null) {
                                        exifInterface4.setAttribute("OffsetTime", tagStringValue7);
                                        exifInterface4.setAttribute("OffsetTimeOriginal", tagStringValue7);
                                        exifInterface4.setAttribute("OffsetTimeDigitized", tagStringValue7);
                                    }
                                    if (tagStringValue8 != null) {
                                        exifInterface4.setAttribute("SubSecTime", tagStringValue8);
                                        exifInterface4.setAttribute("SubSecTimeOriginal", tagStringValue8);
                                        exifInterface4.setAttribute("SubSecTimeDigitized", tagStringValue8);
                                    }
                                    exifInterface4.saveAttributes();
                                    exifInterface = exifInterface3;
                                } catch (IOException e23) {
                                    e = e23;
                                    i3 = 0;
                                    iOException = e;
                                    ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(iOException)).mo17276G((char) 1497)).mo17290o("Could not read exif data");
                                    exifInterface = null;
                                    eitVar = this;
                                    eitVar.f14182i.mo13962f();
                                    nqwVar = nqwVar3;
                                    nqwVar.setProgress(1.0f);
                                    fileInputStream = new FileInputStream(file);
                                    byte[] byteArray2 = ByteStreams.toByteArray(fileInputStream);
                                    gyh gyhVar2 = eitVar.f14175a;
                                    PanoMeta panoMeta2 = stereoPanorama.f6740c;
                                    new kbc(panoMeta2.croppedAreaImageWidthPixels, panoMeta2.croppedAreaImageHeightPixels);
                                    hln hlnVar2 = new hln(krd.JPEG);
                                    hlnVar2.m10447a(exifInterface);
                                    hlnVar2.m10448b(kay.CLOCKWISE_0);
                                    gyhVar2.mo9912r(byteArray2, hlnVar2);
                                    fileInputStream.close();
                                    z = true;
                                    nqwVar.m17627a();
                                    mwsVarM17095j3 = mws.m17095j(eitVar.f14181h);
                                    size3 = mwsVarM17095j3.size();
                                    while (i2 < size3) {
                                        ((kao) mwsVarM17095j3.get(i2)).mo3483a(eitVar);
                                    }
                                    if (z) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            } catch (IOException e24) {
                                e = e24;
                                file = file3;
                                nqwVar3 = nqwVar4;
                                stereoPanorama = stereoPanorama2;
                            }
                            eitVar = this;
                            try {
                                eitVar.f14182i.mo13962f();
                                nqwVar = nqwVar3;
                                nqwVar.setProgress(1.0f);
                                fileInputStream = new FileInputStream(file);
                                byte[] byteArray3 = ByteStreams.toByteArray(fileInputStream);
                                gyh gyhVar3 = eitVar.f14175a;
                                PanoMeta panoMeta3 = stereoPanorama.f6740c;
                                new kbc(panoMeta3.croppedAreaImageWidthPixels, panoMeta3.croppedAreaImageHeightPixels);
                                hln hlnVar3 = new hln(krd.JPEG);
                                hlnVar3.m10447a(exifInterface);
                                hlnVar3.m10448b(kay.CLOCKWISE_0);
                                gyhVar3.mo9912r(byteArray3, hlnVar3);
                                fileInputStream.close();
                                z = true;
                            } catch (Exception e25) {
                                e = e25;
                                nqwVar = nqwVar3;
                                exc = e;
                                ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(exc)).mo17276G(1498)).mo17290o("Failed to compute panorama");
                                nqwVar.m17627a();
                                mwsVarM17095j2 = mws.m17095j(eitVar.f14181h);
                                size2 = mwsVarM17095j2.size();
                                while (i3 < size2) {
                                    ((kao) mwsVarM17095j2.get(i3)).mo3483a(eitVar);
                                    i3++;
                                }
                                return;
                            } catch (Throwable th13) {
                                th = th13;
                                obj = nqwVar3;
                                th = th;
                                nqwVar2 = obj;
                                nqwVar2.m17627a();
                                mwsVarM17095j = mws.m17095j(eitVar.f14181h);
                                size = mwsVarM17095j.size();
                                while (i3 < size) {
                                    ((kao) mwsVarM17095j.get(i3)).mo3483a(eitVar);
                                    i3++;
                                }
                                throw th;
                            }
                        } catch (Exception e26) {
                            e = e26;
                            i3 = 0;
                            eitVar = this;
                            nqwVar = nqwVar4;
                            exc = e;
                            ((nbe) ((nbe) ((nbe) f14174b.m17251b()).mo17283h(exc)).mo17276G(1498)).mo17290o("Failed to compute panorama");
                            nqwVar.m17627a();
                            mwsVarM17095j2 = mws.m17095j(eitVar.f14181h);
                            size2 = mwsVarM17095j2.size();
                            while (i3 < size2) {
                                ((kao) mwsVarM17095j2.get(i3)).mo3483a(eitVar);
                                i3++;
                            }
                            return;
                        } catch (Throwable th14) {
                            th = th14;
                            i3 = 0;
                            eitVar = this;
                            obj = nqwVar4;
                            th = th;
                            nqwVar2 = obj;
                            nqwVar2.m17627a();
                            mwsVarM17095j = mws.m17095j(eitVar.f14181h);
                            size = mwsVarM17095j.size();
                            while (i3 < size) {
                                ((kao) mwsVarM17095j.get(i3)).mo3483a(eitVar);
                                i3++;
                            }
                            throw th;
                        }
                    }
                } else {
                    nqwVar = nqwVar4;
                    z = false;
                }
                nqwVar.m17627a();
                mwsVarM17095j3 = mws.m17095j(eitVar.f14181h);
                size3 = mwsVarM17095j3.size();
                while (i2 < size3) {
                    ((kao) mwsVarM17095j3.get(i2)).mo3483a(eitVar);
                }
                if (z || (fileArrListFiles = (file2 = new File(eitVar.f14184k.m7357a())).listFiles()) == null) {
                    return;
                }
                while (i3 < fileArrListFiles.length) {
                    fileArrListFiles[i3].delete();
                    i3++;
                }
                file2.delete();
            } catch (Throwable th15) {
                th = th15;
            }
        } catch (Exception e27) {
            e = e27;
        } catch (Throwable th16) {
            th = th16;
        }
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: e */
    public final void mo7367e(kao kaoVar) {
        kaoVar.getClass();
        this.f14181h.remove(kaoVar);
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: f */
    public final void mo7368f() {
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: g */
    public final void mo7369g() {
    }
}
