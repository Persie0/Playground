package p000;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public final class jv2 {

    /* JADX INFO: renamed from: D */
    public static final String[] f46181D;

    /* JADX INFO: renamed from: E */
    public static final int[] f46182E;

    /* JADX INFO: renamed from: F */
    public static final byte[] f46183F;

    /* JADX INFO: renamed from: G */
    public static final gv2 f46184G;

    /* JADX INFO: renamed from: H */
    public static final gv2[][] f46185H;

    /* JADX INFO: renamed from: I */
    public static final gv2[] f46186I;

    /* JADX INFO: renamed from: J */
    public static final HashMap[] f46187J;

    /* JADX INFO: renamed from: K */
    public static final HashMap[] f46188K;

    /* JADX INFO: renamed from: L */
    public static final HashSet f46189L;

    /* JADX INFO: renamed from: M */
    public static final HashMap f46190M;

    /* JADX INFO: renamed from: N */
    public static final Charset f46191N;

    /* JADX INFO: renamed from: O */
    public static final byte[] f46192O;

    /* JADX INFO: renamed from: P */
    public static final byte[] f46193P;

    /* JADX INFO: renamed from: a */
    public final FileDescriptor f46209a;

    /* JADX INFO: renamed from: b */
    public final AssetManager.AssetInputStream f46210b;

    /* JADX INFO: renamed from: c */
    public int f46211c;

    /* JADX INFO: renamed from: d */
    public final HashMap[] f46212d;

    /* JADX INFO: renamed from: e */
    public final HashSet f46213e;

    /* JADX INFO: renamed from: f */
    public ByteOrder f46214f;

    /* JADX INFO: renamed from: g */
    public boolean f46215g;

    /* JADX INFO: renamed from: h */
    public int f46216h;

    /* JADX INFO: renamed from: i */
    public int f46217i;

    /* JADX INFO: renamed from: j */
    public int f46218j;

    /* JADX INFO: renamed from: k */
    public int f46219k;

    /* JADX INFO: renamed from: l */
    public static final boolean f46194l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m */
    public static final List f46195m = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: n */
    public static final List f46196n = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: o */
    public static final int[] f46197o = {8, 8, 8};

    /* JADX INFO: renamed from: p */
    public static final int[] f46198p = {8};

    /* JADX INFO: renamed from: q */
    public static final byte[] f46199q = {-1, -40, -1};

    /* JADX INFO: renamed from: r */
    public static final byte[] f46200r = {102, 116, 121, 112};

    /* JADX INFO: renamed from: s */
    public static final byte[] f46201s = {109, 105, 102, 49};

    /* JADX INFO: renamed from: t */
    public static final byte[] f46202t = {104, 101, 105, 99};

    /* JADX INFO: renamed from: u */
    public static final byte[] f46203u = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: v */
    public static final byte[] f46204v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: w */
    public static final byte[] f46205w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: x */
    public static final byte[] f46206x = {101, 88, 73, 102};

    /* JADX INFO: renamed from: y */
    public static final byte[] f46207y = {73, 72, 68, 82};

    /* JADX INFO: renamed from: z */
    public static final byte[] f46208z = {73, 69, 78, 68};

    /* JADX INFO: renamed from: A */
    public static final byte[] f46178A = {82, 73, 70, 70};

    /* JADX INFO: renamed from: B */
    public static final byte[] f46179B = {87, 69, 66, 80};

    /* JADX INFO: renamed from: C */
    public static final byte[] f46180C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f46181D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f46182E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f46183F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        gv2[] gv2VarArr = {new gv2("NewSubfileType", 254, 4), new gv2("SubfileType", 255, 4), new gv2("ImageWidth", 256, 3, 4), new gv2("ImageLength", 257, 3, 4), new gv2("BitsPerSample", 258, 3), new gv2("Compression", 259, 3), new gv2("PhotometricInterpretation", 262, 3), new gv2("ImageDescription", 270, 2), new gv2("Make", 271, 2), new gv2("Model", 272, 2), new gv2("StripOffsets", 273, 3, 4), new gv2("Orientation", 274, 3), new gv2("SamplesPerPixel", 277, 3), new gv2("RowsPerStrip", 278, 3, 4), new gv2("StripByteCounts", 279, 3, 4), new gv2("XResolution", 282, 5), new gv2("YResolution", 283, 5), new gv2("PlanarConfiguration", 284, 3), new gv2("ResolutionUnit", 296, 3), new gv2("TransferFunction", 301, 3), new gv2("Software", 305, 2), new gv2("DateTime", 306, 2), new gv2("Artist", 315, 2), new gv2("WhitePoint", 318, 5), new gv2("PrimaryChromaticities", 319, 5), new gv2("SubIFDPointer", 330, 4), new gv2("JPEGInterchangeFormat", 513, 4), new gv2("JPEGInterchangeFormatLength", 514, 4), new gv2("YCbCrCoefficients", 529, 5), new gv2("YCbCrSubSampling", 530, 3), new gv2("YCbCrPositioning", 531, 3), new gv2("ReferenceBlackWhite", 532, 5), new gv2("Copyright", 33432, 2), new gv2("ExifIFDPointer", 34665, 4), new gv2("GPSInfoIFDPointer", 34853, 4), new gv2("SensorTopBorder", 4, 4), new gv2("SensorLeftBorder", 5, 4), new gv2("SensorBottomBorder", 6, 4), new gv2("SensorRightBorder", 7, 4), new gv2("ISO", 23, 3), new gv2("JpgFromRaw", 46, 7), new gv2("Xmp", 700, 1)};
        gv2[] gv2VarArr2 = {new gv2("ExposureTime", 33434, 5), new gv2("FNumber", 33437, 5), new gv2("ExposureProgram", 34850, 3), new gv2("SpectralSensitivity", 34852, 2), new gv2("PhotographicSensitivity", 34855, 3), new gv2("OECF", 34856, 7), new gv2("SensitivityType", 34864, 3), new gv2("StandardOutputSensitivity", 34865, 4), new gv2("RecommendedExposureIndex", 34866, 4), new gv2("ISOSpeed", 34867, 4), new gv2("ISOSpeedLatitudeyyy", 34868, 4), new gv2("ISOSpeedLatitudezzz", 34869, 4), new gv2("ExifVersion", 36864, 2), new gv2("DateTimeOriginal", 36867, 2), new gv2("DateTimeDigitized", 36868, 2), new gv2("OffsetTime", 36880, 2), new gv2("OffsetTimeOriginal", 36881, 2), new gv2("OffsetTimeDigitized", 36882, 2), new gv2("ComponentsConfiguration", 37121, 7), new gv2("CompressedBitsPerPixel", 37122, 5), new gv2("ShutterSpeedValue", 37377, 10), new gv2("ApertureValue", 37378, 5), new gv2("BrightnessValue", 37379, 10), new gv2("ExposureBiasValue", 37380, 10), new gv2("MaxApertureValue", 37381, 5), new gv2("SubjectDistance", 37382, 5), new gv2("MeteringMode", 37383, 3), new gv2("LightSource", 37384, 3), new gv2("Flash", 37385, 3), new gv2("FocalLength", 37386, 5), new gv2("SubjectArea", 37396, 3), new gv2("MakerNote", 37500, 7), new gv2("UserComment", 37510, 7), new gv2("SubSecTime", 37520, 2), new gv2("SubSecTimeOriginal", 37521, 2), new gv2("SubSecTimeDigitized", 37522, 2), new gv2("FlashpixVersion", 40960, 7), new gv2("ColorSpace", 40961, 3), new gv2("PixelXDimension", 40962, 3, 4), new gv2("PixelYDimension", 40963, 3, 4), new gv2("RelatedSoundFile", 40964, 2), new gv2("InteroperabilityIFDPointer", 40965, 4), new gv2("FlashEnergy", 41483, 5), new gv2("SpatialFrequencyResponse", 41484, 7), new gv2("FocalPlaneXResolution", 41486, 5), new gv2("FocalPlaneYResolution", 41487, 5), new gv2("FocalPlaneResolutionUnit", 41488, 3), new gv2("SubjectLocation", 41492, 3), new gv2("ExposureIndex", 41493, 5), new gv2("SensingMethod", 41495, 3), new gv2("FileSource", 41728, 7), new gv2("SceneType", 41729, 7), new gv2("CFAPattern", 41730, 7), new gv2("CustomRendered", 41985, 3), new gv2("ExposureMode", 41986, 3), new gv2("WhiteBalance", 41987, 3), new gv2("DigitalZoomRatio", 41988, 5), new gv2("FocalLengthIn35mmFilm", 41989, 3), new gv2("SceneCaptureType", 41990, 3), new gv2("GainControl", 41991, 3), new gv2("Contrast", 41992, 3), new gv2("Saturation", 41993, 3), new gv2("Sharpness", 41994, 3), new gv2("DeviceSettingDescription", 41995, 7), new gv2("SubjectDistanceRange", 41996, 3), new gv2("ImageUniqueID", 42016, 2), new gv2("CameraOwnerName", 42032, 2), new gv2("BodySerialNumber", 42033, 2), new gv2("LensSpecification", 42034, 5), new gv2("LensMake", 42035, 2), new gv2("LensModel", 42036, 2), new gv2("Gamma", 42240, 5), new gv2("DNGVersion", 50706, 1), new gv2("DefaultCropSize", 50720, 3, 4)};
        gv2[] gv2VarArr3 = {new gv2("GPSVersionID", 0, 1), new gv2("GPSLatitudeRef", 1, 2), new gv2("GPSLatitude", 2, 5, 10), new gv2("GPSLongitudeRef", 3, 2), new gv2("GPSLongitude", 4, 5, 10), new gv2("GPSAltitudeRef", 5, 1), new gv2("GPSAltitude", 6, 5), new gv2("GPSTimeStamp", 7, 5), new gv2("GPSSatellites", 8, 2), new gv2("GPSStatus", 9, 2), new gv2("GPSMeasureMode", 10, 2), new gv2("GPSDOP", 11, 5), new gv2("GPSSpeedRef", 12, 2), new gv2("GPSSpeed", 13, 5), new gv2("GPSTrackRef", 14, 2), new gv2("GPSTrack", 15, 5), new gv2("GPSImgDirectionRef", 16, 2), new gv2("GPSImgDirection", 17, 5), new gv2("GPSMapDatum", 18, 2), new gv2("GPSDestLatitudeRef", 19, 2), new gv2("GPSDestLatitude", 20, 5), new gv2("GPSDestLongitudeRef", 21, 2), new gv2("GPSDestLongitude", 22, 5), new gv2("GPSDestBearingRef", 23, 2), new gv2("GPSDestBearing", 24, 5), new gv2("GPSDestDistanceRef", 25, 2), new gv2("GPSDestDistance", 26, 5), new gv2("GPSProcessingMethod", 27, 7), new gv2("GPSAreaInformation", 28, 7), new gv2("GPSDateStamp", 29, 2), new gv2("GPSDifferential", 30, 3), new gv2("GPSHPositioningError", 31, 5)};
        gv2[] gv2VarArr4 = {new gv2("InteroperabilityIndex", 1, 2)};
        gv2[] gv2VarArr5 = {new gv2("NewSubfileType", 254, 4), new gv2("SubfileType", 255, 4), new gv2("ThumbnailImageWidth", 256, 3, 4), new gv2("ThumbnailImageLength", 257, 3, 4), new gv2("BitsPerSample", 258, 3), new gv2("Compression", 259, 3), new gv2("PhotometricInterpretation", 262, 3), new gv2("ImageDescription", 270, 2), new gv2("Make", 271, 2), new gv2("Model", 272, 2), new gv2("StripOffsets", 273, 3, 4), new gv2("ThumbnailOrientation", 274, 3), new gv2("SamplesPerPixel", 277, 3), new gv2("RowsPerStrip", 278, 3, 4), new gv2("StripByteCounts", 279, 3, 4), new gv2("XResolution", 282, 5), new gv2("YResolution", 283, 5), new gv2("PlanarConfiguration", 284, 3), new gv2("ResolutionUnit", 296, 3), new gv2("TransferFunction", 301, 3), new gv2("Software", 305, 2), new gv2("DateTime", 306, 2), new gv2("Artist", 315, 2), new gv2("WhitePoint", 318, 5), new gv2("PrimaryChromaticities", 319, 5), new gv2("SubIFDPointer", 330, 4), new gv2("JPEGInterchangeFormat", 513, 4), new gv2("JPEGInterchangeFormatLength", 514, 4), new gv2("YCbCrCoefficients", 529, 5), new gv2("YCbCrSubSampling", 530, 3), new gv2("YCbCrPositioning", 531, 3), new gv2("ReferenceBlackWhite", 532, 5), new gv2("Copyright", 33432, 2), new gv2("ExifIFDPointer", 34665, 4), new gv2("GPSInfoIFDPointer", 34853, 4), new gv2("DNGVersion", 50706, 1), new gv2("DefaultCropSize", 50720, 3, 4)};
        f46184G = new gv2("StripOffsets", 273, 3);
        f46185H = new gv2[][]{gv2VarArr, gv2VarArr2, gv2VarArr3, gv2VarArr4, gv2VarArr5, gv2VarArr, new gv2[]{new gv2("ThumbnailImage", 256, 7), new gv2("CameraSettingsIFDPointer", 8224, 4), new gv2("ImageProcessingIFDPointer", 8256, 4)}, new gv2[]{new gv2("PreviewImageStart", 257, 4), new gv2("PreviewImageLength", 258, 4)}, new gv2[]{new gv2("AspectFrame", 4371, 3)}, new gv2[]{new gv2("ColorSpace", 55, 3)}};
        f46186I = new gv2[]{new gv2("SubIFDPointer", 330, 4), new gv2("ExifIFDPointer", 34665, 4), new gv2("GPSInfoIFDPointer", 34853, 4), new gv2("InteroperabilityIFDPointer", 40965, 4), new gv2("CameraSettingsIFDPointer", 8224, 1), new gv2("ImageProcessingIFDPointer", 8256, 1)};
        f46187J = new HashMap[10];
        f46188K = new HashMap[10];
        f46189L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f46190M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f46191N = charsetForName;
        f46192O = "Exif\u0000\u0000".getBytes(charsetForName);
        f46193P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            gv2[][] gv2VarArr6 = f46185H;
            if (i >= gv2VarArr6.length) {
                HashMap map = f46190M;
                gv2[] gv2VarArr7 = f46186I;
                map.put(Integer.valueOf(gv2VarArr7[0].f41370a), 5);
                map.put(Integer.valueOf(gv2VarArr7[1].f41370a), 1);
                map.put(Integer.valueOf(gv2VarArr7[2].f41370a), 2);
                map.put(Integer.valueOf(gv2VarArr7[3].f41370a), 3);
                map.put(Integer.valueOf(gv2VarArr7[4].f41370a), 7);
                map.put(Integer.valueOf(gv2VarArr7[5].f41370a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f46187J[i] = new HashMap();
            f46188K[i] = new HashMap();
            for (gv2 gv2Var : gv2VarArr6[i]) {
                f46187J[i].put(Integer.valueOf(gv2Var.f41370a), gv2Var);
                f46188K[i].put(gv2Var.f41371b, gv2Var);
            }
            i++;
        }
    }

    public jv2(InputStream inputStream) throws IOException {
        gv2[][] gv2VarArr = f46185H;
        this.f46212d = new HashMap[gv2VarArr.length];
        this.f46213e = new HashSet(gv2VarArr.length);
        this.f46214f = ByteOrder.BIG_ENDIAN;
        boolean z = inputStream instanceof AssetManager.AssetInputStream;
        boolean z2 = f46194l;
        if (z) {
            this.f46210b = (AssetManager.AssetInputStream) inputStream;
            this.f46209a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                lv2.m16552c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f46210b = null;
                this.f46209a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z2) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f46210b = null;
                this.f46209a = null;
            }
        } else {
            this.f46210b = null;
            this.f46209a = null;
        }
        for (int i = 0; i < gv2VarArr.length; i++) {
            try {
                try {
                    this.f46212d[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException e) {
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m14660a();
                    if (!z2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                m14660a();
                if (z2) {
                    m14675p();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM14665f = m14665f(bufferedInputStream);
        this.f46211c = iM14665f;
        if (iM14665f == 4 || iM14665f == 9 || iM14665f == 13 || iM14665f == 14) {
            ev2 ev2Var = new ev2(bufferedInputStream);
            int i2 = this.f46211c;
            if (i2 == 4) {
                m14664e(ev2Var, 0, 0);
            } else if (i2 == 13) {
                m14667h(ev2Var);
            } else if (i2 == 9) {
                m14668i(ev2Var);
            } else if (i2 == 14) {
                m14671l(ev2Var);
            }
        } else {
            iv2 iv2Var = new iv2(bufferedInputStream);
            int i3 = this.f46211c;
            if (i3 == 12) {
                m14663d(iv2Var);
            } else if (i3 == 7) {
                m14666g(iv2Var);
            } else if (i3 == 10) {
                m14670k(iv2Var);
            } else {
                m14669j(iv2Var);
            }
            iv2Var.m14156b(this.f46216h);
            m14679u(iv2Var);
        }
        m14660a();
        if (!z2) {
            return;
        }
        m14675p();
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m14659q(ev2 ev2Var) throws IOException {
        short s = ev2Var.readShort();
        boolean z = f46194l;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            v63.m23132j(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public final void m14660a() {
        String strM14661b = m14661b("DateTimeOriginal");
        HashMap[] mapArr = this.f46212d;
        if (strM14661b != null && m14661b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM14661b.concat("\u0000").getBytes(f46191N);
            map.put("DateTime", new fv2(bytes, 2, bytes.length));
        }
        if (m14661b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", fv2.m12203a(0L, this.f46214f));
        }
        if (m14661b("ImageLength") == null) {
            mapArr[0].put("ImageLength", fv2.m12203a(0L, this.f46214f));
        }
        if (m14661b("Orientation") == null) {
            mapArr[0].put("Orientation", fv2.m12203a(0L, this.f46214f));
        }
        if (m14661b("LightSource") == null) {
            mapArr[1].put("LightSource", fv2.m12203a(0L, this.f46214f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m14661b(String str) {
        fv2 fv2VarM14662c = m14662c(str);
        if (fv2VarM14662c != null) {
            int i = fv2VarM14662c.f39732a;
            if (!f46189L.contains(str)) {
                return fv2VarM14662c.m12208f(this.f46214f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                hv2[] hv2VarArr = (hv2[]) fv2VarM14662c.m12209g(this.f46214f);
                if (hv2VarArr == null || hv2VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(hv2VarArr));
                    return null;
                }
                hv2 hv2Var = hv2VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (hv2Var.f42972a / hv2Var.f42973b));
                hv2 hv2Var2 = hv2VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (hv2Var2.f42972a / hv2Var2.f42973b));
                hv2 hv2Var3 = hv2VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (hv2Var3.f42972a / hv2Var3.f42973b)));
            }
            try {
                return Double.toString(fv2VarM14662c.m12206d(this.f46214f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final fv2 m14662c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f46194l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f46185H.length; i++) {
            fv2 fv2Var = (fv2) this.f46212d[i].get(str);
            if (fv2Var != null) {
                return fv2Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m14663d(iv2 iv2Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mv2.m17055a(mediaMetadataRetriever, new dv2(iv2Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f46212d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", fv2.m12205c(Integer.parseInt(strExtractMetadata), this.f46214f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", fv2.m12205c(Integer.parseInt(strExtractMetadata2), this.f46214f));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", fv2.m12205c(i, this.f46214f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    iv2Var.m14156b(i3);
                    byte[] bArr = new byte[6];
                    iv2Var.readFully(bArr);
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f46192O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    iv2Var.readFully(bArr2);
                    this.f46216h = i5;
                    m14676r(0, bArr2);
                }
                if (f46194l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163 A[LOOP:0: B:10:0x0034->B:57:0x0163, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x016b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: e */
    public final void m14664e(p000.ev2 r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jv2.m14664e(ev2, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:121:0x015b A[LOOP:3: B:116:0x014f->B:121:0x015b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0165  */
    /* JADX WARN: Code duplicated, block: B:128:0x016f A[LOOP:4: B:123:0x0160->B:128:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0175 A[LOOP:2: B:111:0x0142->B:131:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x017d  */
    /* JADX WARN: Code duplicated, block: B:154:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x016e A[EDGE_INSN: B:168:0x016e->B:127:0x016e BREAK  A[LOOP:3: B:116:0x014f->B:121:0x015b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x016e A[EDGE_INSN: B:170:0x016e->B:127:0x016e BREAK  A[LOOP:3: B:116:0x014f->B:121:0x015b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX INFO: renamed from: f */
    public final int m14665f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        ev2 ev2Var;
        ev2 ev2Var2;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        byte[] bArr3;
        ev2 ev2Var3;
        short s;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr5 = f46199q;
            if (i7 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i7] != bArr5[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    byte b = bArr4[i8];
                    ?? r7 = bytes[i8];
                    if (b != r7) {
                        ?? r4 = 0;
                        ev2 ev2Var4 = null;
                        ev2 ev2Var5 = null;
                        ev2 ev2Var6 = null;
                        try {
                            try {
                                ev2Var = new ev2(bArr4);
                                try {
                                    long j2 = ev2Var.readInt();
                                    byte[] bArr6 = new byte[4];
                                    ev2Var.readFully(bArr6);
                                    try {
                                        try {
                                            if (Arrays.equals(bArr6, f46200r)) {
                                                if (j2 == 1) {
                                                    j2 = ev2Var.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                } else {
                                                    j = 8;
                                                }
                                                if (j2 > 5000) {
                                                    j2 = 5000;
                                                }
                                                long j3 = j2 - j;
                                                if (j3 >= 8) {
                                                    byte[] bArr7 = new byte[4];
                                                    boolean z = false;
                                                    boolean z2 = false;
                                                    for (long j4 = 0; j4 < j3 / 4; j4++) {
                                                        try {
                                                            ev2Var.readFully(bArr7);
                                                            if (j4 != 1) {
                                                                i = 0;
                                                                try {
                                                                    if (Arrays.equals(bArr7, f46201s)) {
                                                                        z = true;
                                                                    } else if (Arrays.equals(bArr7, f46202t)) {
                                                                        z2 = true;
                                                                    }
                                                                    if (z && z2) {
                                                                        ev2Var.close();
                                                                        return 12;
                                                                    }
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                }
                                                            }
                                                        } catch (EOFException unused) {
                                                        }
                                                    }
                                                    i = 0;
                                                    ev2Var.close();
                                                    ev2Var2 = new ev2(bArr4);
                                                    ByteOrder byteOrderM14659q = m14659q(ev2Var2);
                                                    this.f46214f = byteOrderM14659q;
                                                    ev2Var2.f37930c = byteOrderM14659q;
                                                    s = ev2Var2.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    ev2Var2.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        ev2Var3 = new ev2(bArr4);
                                                        try {
                                                            ByteOrder byteOrderM14659q2 = m14659q(ev2Var3);
                                                            this.f46214f = byteOrderM14659q2;
                                                            ev2Var3.f37930c = byteOrderM14659q2;
                                                            i3 = ev2Var3.readShort() != 85 ? i : 1;
                                                            ev2Var3.close();
                                                        } catch (Exception unused2) {
                                                            ev2Var4 = ev2Var3;
                                                            if (ev2Var4 != null) {
                                                                ev2Var4.close();
                                                            }
                                                            i3 = i;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            ev2Var5 = ev2Var3;
                                                            if (ev2Var5 != null) {
                                                                ev2Var5.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused3) {
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = f46205w;
                                                        if (i4 >= bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            while (true) {
                                                                bArr2 = f46178A;
                                                                if (i5 >= bArr2.length) {
                                                                    i6 = i;
                                                                    while (true) {
                                                                        bArr3 = f46179B;
                                                                        if (i6 >= bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                            break;
                                                                        }
                                                                        i6++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i5] != bArr2[i5]) {
                                                                        break;
                                                                    }
                                                                    i5++;
                                                                }
                                                            }
                                                            return i;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                                if (f46194l) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (ev2Var != null) {
                                                    ev2Var.close();
                                                }
                                                ev2Var2 = new ev2(bArr4);
                                                ByteOrder byteOrderM14659q3 = m14659q(ev2Var2);
                                                this.f46214f = byteOrderM14659q3;
                                                ev2Var2.f37930c = byteOrderM14659q3;
                                                s = ev2Var2.readShort();
                                                if (s != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                ev2Var2.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                ev2Var3 = new ev2(bArr4);
                                                ByteOrder byteOrderM14659q4 = m14659q(ev2Var3);
                                                this.f46214f = byteOrderM14659q4;
                                                ev2Var3.f37930c = byteOrderM14659q4;
                                                if (ev2Var3.readShort() != 85) {
                                                }
                                                ev2Var3.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = f46205w;
                                                    if (i4 >= bArr.length) {
                                                        return 13;
                                                    }
                                                    if (bArr4[i4] != bArr[i4]) {
                                                        i5 = i;
                                                        while (true) {
                                                            bArr2 = f46178A;
                                                            if (i5 >= bArr2.length) {
                                                                i6 = i;
                                                                while (true) {
                                                                    bArr3 = f46179B;
                                                                    if (i6 >= bArr3.length) {
                                                                        return 14;
                                                                    }
                                                                    if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                            } else {
                                                                if (bArr4[i5] != bArr2[i5]) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i5++;
                                                            }
                                                        }
                                                        return i;
                                                    }
                                                    i4++;
                                                }
                                            }
                                            ByteOrder byteOrderM14659q5 = m14659q(ev2Var2);
                                            this.f46214f = byteOrderM14659q5;
                                            ev2Var2.f37930c = byteOrderM14659q5;
                                            s = ev2Var2.readShort();
                                            if (s != 20306) {
                                                i2 = 1;
                                            } else {
                                                i2 = 1;
                                            }
                                            ev2Var2.close();
                                        } catch (Exception unused4) {
                                            if (ev2Var2 != null) {
                                                ev2Var2.close();
                                            }
                                            i2 = i;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            ev2Var6 = ev2Var2;
                                            if (ev2Var6 != null) {
                                                ev2Var6.close();
                                            }
                                            throw th;
                                        }
                                        ev2Var2 = new ev2(bArr4);
                                    } catch (Exception unused5) {
                                        ev2Var2 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                    ev2Var.close();
                                    i = 0;
                                } catch (Exception e2) {
                                    e = e2;
                                    i = 0;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r4 = r7;
                                if (r4 != 0) {
                                    r4.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            ev2Var = null;
                        } catch (Throwable th6) {
                            th = th6;
                            if (r4 != 0) {
                                r4.close();
                            }
                            throw th;
                        }
                        if (i2 != 0) {
                            return 7;
                        }
                        ev2Var3 = new ev2(bArr4);
                        ByteOrder byteOrderM14659q6 = m14659q(ev2Var3);
                        this.f46214f = byteOrderM14659q6;
                        ev2Var3.f37930c = byteOrderM14659q6;
                        if (ev2Var3.readShort() != 85) {
                        }
                        ev2Var3.close();
                        if (i3 != 0) {
                            return 10;
                        }
                        i4 = i;
                        while (true) {
                            bArr = f46205w;
                            if (i4 >= bArr.length) {
                                return 13;
                            }
                            if (bArr4[i4] != bArr[i4]) {
                                i5 = i;
                                while (true) {
                                    bArr2 = f46178A;
                                    if (i5 >= bArr2.length) {
                                        i6 = i;
                                        while (true) {
                                            bArr3 = f46179B;
                                            if (i6 >= bArr3.length) {
                                                return 14;
                                            }
                                            if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                break;
                                                break;
                                            }
                                            i6++;
                                        }
                                    } else {
                                        if (bArr4[i5] != bArr2[i5]) {
                                            break;
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                                return i;
                            }
                            i4++;
                        }
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m14666g(iv2 iv2Var) throws IOException {
        int i;
        int i2;
        m14669j(iv2Var);
        HashMap[] mapArr = this.f46212d;
        fv2 fv2Var = (fv2) mapArr[1].get("MakerNote");
        if (fv2Var != null) {
            iv2 iv2Var2 = new iv2(fv2Var.f39735d);
            iv2Var2.f37930c = this.f46214f;
            byte[] bArr = f46203u;
            byte[] bArr2 = new byte[bArr.length];
            iv2Var2.readFully(bArr2);
            iv2Var2.m14156b(0L);
            byte[] bArr3 = f46204v;
            byte[] bArr4 = new byte[bArr3.length];
            iv2Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iv2Var2.m14156b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iv2Var2.m14156b(12L);
            }
            m14677s(iv2Var2, 6);
            fv2 fv2Var2 = (fv2) mapArr[7].get("PreviewImageStart");
            fv2 fv2Var3 = (fv2) mapArr[7].get("PreviewImageLength");
            if (fv2Var2 != null && fv2Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", fv2Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", fv2Var3);
            }
            fv2 fv2Var4 = (fv2) mapArr[8].get("AspectFrame");
            if (fv2Var4 != null) {
                int[] iArr = (int[]) fv2Var4.m12209g(this.f46214f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                fv2 fv2VarM12205c = fv2.m12205c(i5, this.f46214f);
                fv2 fv2VarM12205c2 = fv2.m12205c(i6, this.f46214f);
                mapArr[0].put("ImageWidth", fv2VarM12205c);
                mapArr[0].put("ImageLength", fv2VarM12205c2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14667h(ev2 ev2Var) throws IOException {
        if (f46194l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + ev2Var);
        }
        ev2Var.f37930c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f46205w;
        ev2Var.m11361a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = ev2Var.readInt();
                byte[] bArr2 = new byte[4];
                ev2Var.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f46207y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f46208z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f46206x)) {
                    byte[] bArr3 = new byte[i];
                    ev2Var.readFully(bArr3);
                    int i3 = ev2Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f46216h = i2;
                        m14676r(0, bArr3);
                        m14682x();
                        m14679u(new ev2(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                ev2Var.m11361a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                v63.m23133k("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m14668i(ev2 ev2Var) throws IOException {
        boolean z = f46194l;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + ev2Var);
        }
        ev2Var.m11361a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        ev2Var.readFully(bArr);
        ev2Var.readFully(bArr2);
        ev2Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        ev2Var.m11361a(i - ev2Var.f37929b);
        ev2Var.readFully(bArr4);
        m14664e(new ev2(bArr4), i, 5);
        ev2Var.m11361a(i3 - ev2Var.f37929b);
        ev2Var.f37930c = ByteOrder.BIG_ENDIAN;
        int i4 = ev2Var.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = ev2Var.readUnsignedShort();
            int unsignedShort2 = ev2Var.readUnsignedShort();
            if (unsignedShort == f46184G.f41370a) {
                short s = ev2Var.readShort();
                short s2 = ev2Var.readShort();
                fv2 fv2VarM12205c = fv2.m12205c(s, this.f46214f);
                fv2 fv2VarM12205c2 = fv2.m12205c(s2, this.f46214f);
                HashMap[] mapArr = this.f46212d;
                mapArr[0].put("ImageLength", fv2VarM12205c);
                mapArr[0].put("ImageWidth", fv2VarM12205c2);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            ev2Var.m11361a(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m14669j(iv2 iv2Var) throws IOException {
        m14674o(iv2Var);
        m14677s(iv2Var, 0);
        m14681w(iv2Var, 0);
        m14681w(iv2Var, 5);
        m14681w(iv2Var, 4);
        m14682x();
        if (this.f46211c == 8) {
            HashMap[] mapArr = this.f46212d;
            fv2 fv2Var = (fv2) mapArr[1].get("MakerNote");
            if (fv2Var != null) {
                iv2 iv2Var2 = new iv2(fv2Var.f39735d);
                iv2Var2.f37930c = this.f46214f;
                iv2Var2.m11361a(6);
                m14677s(iv2Var2, 9);
                fv2 fv2Var2 = (fv2) mapArr[9].get("ColorSpace");
                if (fv2Var2 != null) {
                    mapArr[1].put("ColorSpace", fv2Var2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m14670k(iv2 iv2Var) throws IOException {
        if (f46194l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + iv2Var);
        }
        m14669j(iv2Var);
        HashMap[] mapArr = this.f46212d;
        fv2 fv2Var = (fv2) mapArr[0].get("JpgFromRaw");
        if (fv2Var != null) {
            m14664e(new ev2(fv2Var.f39735d), (int) fv2Var.f39734c, 5);
        }
        fv2 fv2Var2 = (fv2) mapArr[0].get("ISO");
        fv2 fv2Var3 = (fv2) mapArr[1].get("PhotographicSensitivity");
        if (fv2Var2 == null || fv2Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", fv2Var2);
    }

    /* JADX INFO: renamed from: l */
    public final void m14671l(ev2 ev2Var) throws IOException {
        if (f46194l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + ev2Var);
        }
        ev2Var.f37930c = ByteOrder.LITTLE_ENDIAN;
        ev2Var.m11361a(f46178A.length);
        int i = ev2Var.readInt() + 8;
        byte[] bArr = f46179B;
        ev2Var.m11361a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                ev2Var.readFully(bArr2);
                int i2 = ev2Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f46180C, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    ev2Var.readFully(bArr3);
                    this.f46216h = i3;
                    m14676r(0, bArr3);
                    m14679u(new ev2(bArr3));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                ev2Var.m11361a(i2);
            } catch (EOFException unused) {
                v63.m23133k("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14672m(ev2 ev2Var, HashMap map) throws IOException {
        fv2 fv2Var = (fv2) map.get("JPEGInterchangeFormat");
        fv2 fv2Var2 = (fv2) map.get("JPEGInterchangeFormatLength");
        if (fv2Var == null || fv2Var2 == null) {
            return;
        }
        int iM12207e = fv2Var.m12207e(this.f46214f);
        int iM12207e2 = fv2Var2.m12207e(this.f46214f);
        if (this.f46211c == 7) {
            iM12207e += this.f46217i;
        }
        if (iM12207e > 0 && iM12207e2 > 0 && this.f46210b == null && this.f46209a == null) {
            ev2Var.m11361a(iM12207e);
            ev2Var.readFully(new byte[iM12207e2]);
        }
        if (f46194l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM12207e + ", length: " + iM12207e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m14673n(HashMap map) {
        fv2 fv2Var = (fv2) map.get("ImageLength");
        fv2 fv2Var2 = (fv2) map.get("ImageWidth");
        if (fv2Var == null || fv2Var2 == null) {
            return false;
        }
        return fv2Var.m12207e(this.f46214f) <= 512 && fv2Var2.m12207e(this.f46214f) <= 512;
    }

    /* JADX INFO: renamed from: o */
    public final void m14674o(iv2 iv2Var) throws IOException {
        ByteOrder byteOrderM14659q = m14659q(iv2Var);
        this.f46214f = byteOrderM14659q;
        iv2Var.f37930c = byteOrderM14659q;
        int unsignedShort = iv2Var.readUnsignedShort();
        int i = this.f46211c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            v63.m23132j(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = iv2Var.readInt();
        if (i2 < 8) {
            v63.m23133k(ux5.m22988k(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            iv2Var.m11361a(i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m14675p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f46212d;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM22998u = ux5.m22998u("The size of tag group[", i, "]: ");
            sbM22998u.append(mapArr[i].size());
            Log.d("ExifInterface", sbM22998u.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                fv2 fv2Var = (fv2) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + fv2Var.toString() + ", tagValue: '" + fv2Var.m12208f(this.f46214f) + "'");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m14676r(int i, byte[] bArr) throws IOException {
        iv2 iv2Var = new iv2(bArr);
        m14674o(iv2Var);
        m14677s(iv2Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0301  */
    /* JADX WARN: Code duplicated, block: B:148:0x032b  */
    /* JADX WARN: Code duplicated, block: B:175:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    /* JADX INFO: renamed from: s */
    public final void m14677s(iv2 iv2Var, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z;
        int i2;
        long j3;
        Integer num;
        HashSet hashSet;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        String strM24116l;
        int i3;
        int i4 = iv2Var.f37929b;
        int i5 = iv2Var.f37932e;
        Integer numValueOf = Integer.valueOf(i4);
        HashSet hashSet2 = this.f46213e;
        hashSet2.add(numValueOf);
        short s = iv2Var.readShort();
        boolean z2 = f46194l;
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s));
        }
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            mapArr = this.f46212d;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = iv2Var.readUnsignedShort();
            int unsignedShort3 = iv2Var.readUnsignedShort();
            int i6 = iv2Var.readInt();
            long j6 = ((long) iv2Var.f37929b) + 4;
            short s3 = s;
            gv2 gv2Var = (gv2) f46187J[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), gv2Var != null ? gv2Var.f41371b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            }
            if (gv2Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f46182E;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = gv2Var.f41372c;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = gv2Var.f41373d) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            j = j6;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f46181D[unsignedShort3] + ") is unexpected for tag: " + gv2Var.f41371b);
                        }
                    }
                    if (z) {
                        j3 = j;
                        if (j2 > 4) {
                            i3 = iv2Var.readInt();
                            if (z2 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i3);
                            }
                            if (this.f46211c == 7) {
                                if ("MakerNote".equals(gv2Var.f41371b)) {
                                    this.f46217i = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(gv2Var.f41371b)) {
                                    this.f46218j = i3;
                                    this.f46219k = i6;
                                    fv2 fv2VarM12205c = fv2.m12205c(6, this.f46214f);
                                    fv2 fv2VarM12203a = fv2.m12203a(this.f46218j, this.f46214f);
                                    fv2 fv2VarM12203a2 = fv2.m12203a(this.f46219k, this.f46214f);
                                    mapArr[4].put("Compression", fv2VarM12205c);
                                    mapArr[4].put("JPEGInterchangeFormat", fv2VarM12203a);
                                    mapArr[4].put("JPEGInterchangeFormatLength", fv2VarM12203a2);
                                }
                            }
                            iv2Var.m14156b(i3);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            gv2Var = gv2Var;
                        }
                        num = (Integer) f46190M.get(Integer.valueOf(unsignedShort2));
                        if (z2 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j5 = ((long) iv2Var.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = iv2Var.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = iv2Var.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z2 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), gv2Var.f41371b));
                                }
                                if (j5 > 0 || (i5 != -1 && j5 >= i5)) {
                                    hashSet = hashSet2;
                                    if (z2 != 0) {
                                        strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                                        if (i5 != -1) {
                                            strM24116l = strM24116l + " (total length: " + i5 + ")";
                                        }
                                        Log.d("ExifInterface", strM24116l);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        iv2Var.m14156b(j5);
                                        m14677s(iv2Var, num.intValue());
                                    } else if (z2 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                }
                                iv2Var.m14156b(j3);
                            } else {
                                unsignedShort = iv2Var.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), gv2Var.f41371b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strM24116l = strM24116l + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strM24116l);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strM24116l = strM24116l + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strM24116l);
                                }
                            }
                            iv2Var.m14156b(j3);
                        } else {
                            hashSet = hashSet2;
                            j4 = j3;
                            int i8 = iv2Var.f37929b + this.f46216h;
                            byte[] bArr = new byte[(int) j2];
                            iv2Var.readFully(bArr);
                            fv2 fv2Var = new fv2(i8, bArr, unsignedShort3, i6);
                            HashMap map = mapArr[i];
                            str = gv2Var.f41371b;
                            map.put(str, fv2Var);
                            if ("DNGVersion".equals(str)) {
                                this.f46211c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && fv2Var.m12208f(this.f46214f).contains("PENTAX")) || ("Compression".equals(str) && fv2Var.m12207e(this.f46214f) == 65535)) {
                                this.f46211c = 8;
                            }
                            if (iv2Var.f37929b != j4) {
                                iv2Var.m14156b(j4);
                            }
                        }
                    } else {
                        iv2Var.m14156b(j);
                        hashSet = hashSet2;
                    }
                    s2 = (short) (s2 + 1);
                    hashSet2 = hashSet;
                    s = s3;
                    z2 = z2;
                }
                j = j6;
                if (z2 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z = false;
                if (z) {
                    iv2Var.m14156b(j);
                    hashSet = hashSet2;
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i3 = iv2Var.readInt();
                        if (z2 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i3);
                        }
                        if (this.f46211c == 7) {
                            if ("MakerNote".equals(gv2Var.f41371b)) {
                                this.f46217i = i3;
                            } else if (i != 6) {
                            }
                        }
                        iv2Var.m14156b(i3);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        gv2Var = gv2Var;
                    }
                    num = (Integer) f46190M.get(Integer.valueOf(unsignedShort2));
                    if (z2 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j5 = ((long) iv2Var.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = iv2Var.readInt();
                            } else {
                                unsignedShort = iv2Var.readShort();
                            }
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), gv2Var.f41371b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strM24116l = strM24116l + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strM24116l);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strM24116l = strM24116l + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strM24116l);
                                }
                            }
                            iv2Var.m14156b(j3);
                        } else {
                            unsignedShort = iv2Var.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), gv2Var.f41371b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strM24116l = strM24116l + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strM24116l);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strM24116l = strM24116l + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strM24116l);
                            }
                        }
                        iv2Var.m14156b(j3);
                    } else {
                        hashSet = hashSet2;
                        j4 = j3;
                        int i9 = iv2Var.f37929b + this.f46216h;
                        byte[] bArr2 = new byte[(int) j2];
                        iv2Var.readFully(bArr2);
                        fv2 fv2Var2 = new fv2(i9, bArr2, unsignedShort3, i6);
                        HashMap map2 = mapArr[i];
                        str = gv2Var.f41371b;
                        map2.put(str, fv2Var2);
                        if ("DNGVersion".equals(str)) {
                            this.f46211c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f46211c = 8;
                        if (iv2Var.f37929b != j4) {
                            iv2Var.m14156b(j4);
                        }
                    }
                }
                s2 = (short) (s2 + 1);
                hashSet2 = hashSet;
                s = s3;
                z2 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z = false;
            if (z) {
                iv2Var.m14156b(j);
                hashSet = hashSet2;
            } else {
                j3 = j;
                if (j2 > 4) {
                    i3 = iv2Var.readInt();
                    if (z2 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i3);
                    }
                    if (this.f46211c == 7) {
                        if ("MakerNote".equals(gv2Var.f41371b)) {
                            this.f46217i = i3;
                        } else if (i != 6) {
                        }
                    }
                    iv2Var.m14156b(i3);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    gv2Var = gv2Var;
                }
                num = (Integer) f46190M.get(Integer.valueOf(unsignedShort2));
                if (z2 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j5 = ((long) iv2Var.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = iv2Var.readInt();
                        } else {
                            unsignedShort = iv2Var.readShort();
                        }
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), gv2Var.f41371b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strM24116l = strM24116l + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strM24116l);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strM24116l = strM24116l + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strM24116l);
                            }
                        }
                        iv2Var.m14156b(j3);
                    } else {
                        unsignedShort = iv2Var.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z2 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), gv2Var.f41371b));
                    }
                    if (j5 > 0) {
                        hashSet = hashSet2;
                        if (z2 != 0) {
                            strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                            if (i5 != -1) {
                                strM24116l = strM24116l + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strM24116l);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z2 != 0) {
                            strM24116l = wq1.m24116l("Skip jump into the IFD since its offset is invalid: ", j5);
                            if (i5 != -1) {
                                strM24116l = strM24116l + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strM24116l);
                        }
                    }
                    iv2Var.m14156b(j3);
                } else {
                    hashSet = hashSet2;
                    j4 = j3;
                    int i10 = iv2Var.f37929b + this.f46216h;
                    byte[] bArr3 = new byte[(int) j2];
                    iv2Var.readFully(bArr3);
                    fv2 fv2Var3 = new fv2(i10, bArr3, unsignedShort3, i6);
                    HashMap map3 = mapArr[i];
                    str = gv2Var.f41371b;
                    map3.put(str, fv2Var3);
                    if ("DNGVersion".equals(str)) {
                        this.f46211c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f46211c = 8;
                    if (iv2Var.f37929b != j4) {
                        iv2Var.m14156b(j4);
                    }
                }
            }
            s2 = (short) (s2 + 1);
            hashSet2 = hashSet;
            s = s3;
            z2 = z2;
        }
        HashSet hashSet3 = hashSet2;
        boolean z3 = z2;
        int i11 = iv2Var.readInt();
        if (z3) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j7 = i11;
        if (j7 <= 0) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i11))) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        iv2Var.m14156b(j7);
        if (mapArr[4].isEmpty()) {
            m14677s(iv2Var, 4);
        } else if (mapArr[5].isEmpty()) {
            m14677s(iv2Var, 5);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m14678t(String str, int i, String str2) {
        HashMap[] mapArr = this.f46212d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m14679u(ev2 ev2Var) throws IOException {
        fv2 fv2Var;
        int iM12207e;
        HashMap map = this.f46212d[4];
        fv2 fv2Var2 = (fv2) map.get("Compression");
        if (fv2Var2 == null) {
            m14672m(ev2Var, map);
            return;
        }
        int iM12207e2 = fv2Var2.m12207e(this.f46214f);
        if (iM12207e2 != 1) {
            if (iM12207e2 == 6) {
                m14672m(ev2Var, map);
                return;
            } else if (iM12207e2 != 7) {
                return;
            }
        }
        fv2 fv2Var3 = (fv2) map.get("BitsPerSample");
        if (fv2Var3 != null) {
            int[] iArr = (int[]) fv2Var3.m12209g(this.f46214f);
            int[] iArr2 = f46197o;
            if (Arrays.equals(iArr2, iArr) || (this.f46211c == 3 && (fv2Var = (fv2) map.get("PhotometricInterpretation")) != null && (((iM12207e = fv2Var.m12207e(this.f46214f)) == 1 && Arrays.equals(iArr, f46198p)) || (iM12207e == 6 && Arrays.equals(iArr, iArr2))))) {
                fv2 fv2Var4 = (fv2) map.get("StripOffsets");
                fv2 fv2Var5 = (fv2) map.get("StripByteCounts");
                if (fv2Var4 == null || fv2Var5 == null) {
                    return;
                }
                long[] jArrM21242a = scd.m21242a(fv2Var4.m12209g(this.f46214f));
                long[] jArrM21242a2 = scd.m21242a(fv2Var5.m12209g(this.f46214f));
                if (jArrM21242a == null || jArrM21242a.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM21242a2 == null || jArrM21242a2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM21242a.length != jArrM21242a2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM21242a2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f46215g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM21242a.length; i3++) {
                    int i4 = (int) jArrM21242a[i3];
                    int i5 = (int) jArrM21242a2[i3];
                    if (i3 < jArrM21242a.length - 1 && i4 + i5 != jArrM21242a[i3 + 1]) {
                        this.f46215g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        ev2Var.m11361a(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            ev2Var.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.f46215g) {
                    long j3 = jArrM21242a[0];
                    return;
                }
                return;
            }
        }
        if (f46194l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m14680v(int i, int i2) {
        HashMap[] mapArr = this.f46212d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f46194l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        fv2 fv2Var = (fv2) mapArr[i].get("ImageLength");
        fv2 fv2Var2 = (fv2) mapArr[i].get("ImageWidth");
        fv2 fv2Var3 = (fv2) mapArr[i2].get("ImageLength");
        fv2 fv2Var4 = (fv2) mapArr[i2].get("ImageWidth");
        if (fv2Var == null || fv2Var2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (fv2Var3 == null || fv2Var4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM12207e = fv2Var.m12207e(this.f46214f);
        int iM12207e2 = fv2Var2.m12207e(this.f46214f);
        int iM12207e3 = fv2Var3.m12207e(this.f46214f);
        int iM12207e4 = fv2Var4.m12207e(this.f46214f);
        if (iM12207e >= iM12207e3 || iM12207e2 >= iM12207e4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: w */
    public final void m14681w(iv2 iv2Var, int i) throws IOException {
        fv2 fv2VarM12205c;
        fv2 fv2VarM12205c2;
        HashMap[] mapArr = this.f46212d;
        fv2 fv2Var = (fv2) mapArr[i].get("DefaultCropSize");
        fv2 fv2Var2 = (fv2) mapArr[i].get("SensorTopBorder");
        fv2 fv2Var3 = (fv2) mapArr[i].get("SensorLeftBorder");
        fv2 fv2Var4 = (fv2) mapArr[i].get("SensorBottomBorder");
        fv2 fv2Var5 = (fv2) mapArr[i].get("SensorRightBorder");
        if (fv2Var != null) {
            int i2 = fv2Var.f39732a;
            ByteOrder byteOrder = this.f46214f;
            if (i2 == 5) {
                hv2[] hv2VarArr = (hv2[]) fv2Var.m12209g(byteOrder);
                if (hv2VarArr == null || hv2VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(hv2VarArr));
                    return;
                }
                fv2VarM12205c = fv2.m12204b(hv2VarArr[0], this.f46214f);
                fv2VarM12205c2 = fv2.m12204b(hv2VarArr[1], this.f46214f);
            } else {
                int[] iArr = (int[]) fv2Var.m12209g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                fv2VarM12205c = fv2.m12205c(iArr[0], this.f46214f);
                fv2VarM12205c2 = fv2.m12205c(iArr[1], this.f46214f);
            }
            mapArr[i].put("ImageWidth", fv2VarM12205c);
            mapArr[i].put("ImageLength", fv2VarM12205c2);
            return;
        }
        if (fv2Var2 != null && fv2Var3 != null && fv2Var4 != null && fv2Var5 != null) {
            int iM12207e = fv2Var2.m12207e(this.f46214f);
            int iM12207e2 = fv2Var4.m12207e(this.f46214f);
            int iM12207e3 = fv2Var5.m12207e(this.f46214f);
            int iM12207e4 = fv2Var3.m12207e(this.f46214f);
            if (iM12207e2 <= iM12207e || iM12207e3 <= iM12207e4) {
                return;
            }
            fv2 fv2VarM12205c3 = fv2.m12205c(iM12207e2 - iM12207e, this.f46214f);
            fv2 fv2VarM12205c4 = fv2.m12205c(iM12207e3 - iM12207e4, this.f46214f);
            mapArr[i].put("ImageLength", fv2VarM12205c3);
            mapArr[i].put("ImageWidth", fv2VarM12205c4);
            return;
        }
        fv2 fv2Var6 = (fv2) mapArr[i].get("ImageLength");
        fv2 fv2Var7 = (fv2) mapArr[i].get("ImageWidth");
        if (fv2Var6 == null || fv2Var7 == null) {
            fv2 fv2Var8 = (fv2) mapArr[i].get("JPEGInterchangeFormat");
            fv2 fv2Var9 = (fv2) mapArr[i].get("JPEGInterchangeFormatLength");
            if (fv2Var8 == null || fv2Var9 == null) {
                return;
            }
            int iM12207e5 = fv2Var8.m12207e(this.f46214f);
            int iM12207e6 = fv2Var8.m12207e(this.f46214f);
            iv2Var.m14156b(iM12207e5);
            byte[] bArr = new byte[iM12207e6];
            iv2Var.readFully(bArr);
            m14664e(new ev2(bArr), iM12207e5, i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m14682x() {
        m14680v(0, 5);
        m14680v(0, 4);
        m14680v(5, 4);
        HashMap[] mapArr = this.f46212d;
        fv2 fv2Var = (fv2) mapArr[1].get("PixelXDimension");
        fv2 fv2Var2 = (fv2) mapArr[1].get("PixelYDimension");
        if (fv2Var != null && fv2Var2 != null) {
            mapArr[0].put("ImageWidth", fv2Var);
            mapArr[0].put("ImageLength", fv2Var2);
        }
        if (mapArr[4].isEmpty() && m14673n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m14673n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m14678t("ThumbnailOrientation", 0, "Orientation");
        m14678t("ThumbnailImageLength", 0, "ImageLength");
        m14678t("ThumbnailImageWidth", 0, "ImageWidth");
        m14678t("ThumbnailOrientation", 5, "Orientation");
        m14678t("ThumbnailImageLength", 5, "ImageLength");
        m14678t("ThumbnailImageWidth", 5, "ImageWidth");
        m14678t("Orientation", 4, "ThumbnailOrientation");
        m14678t("ImageLength", 4, "ThumbnailImageLength");
        m14678t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
