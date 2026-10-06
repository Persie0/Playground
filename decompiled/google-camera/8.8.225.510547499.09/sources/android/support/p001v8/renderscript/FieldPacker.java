package android.support.p001v8.renderscript;

import android.util.Log;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FieldPacker {
    private BitSet mAlignment;
    private byte[] mData;
    private int mLen;
    private int mPos;

    public FieldPacker(int i) {
        this.mPos = 0;
        this.mLen = i;
        this.mData = new byte[i];
        this.mAlignment = new BitSet();
    }

    private void addSafely(Object obj) {
        int i = this.mPos;
        while (true) {
            try {
                addToPack(this, obj);
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                this.mPos = i;
                int i2 = this.mLen;
                resize(i2 + i2);
            }
        }
    }

    private static void addToPack(FieldPacker fieldPacker, Object obj) {
        if (obj instanceof Boolean) {
            fieldPacker.addBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Byte) {
            fieldPacker.addI8(((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof Short) {
            fieldPacker.addI16(((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Integer) {
            fieldPacker.addI32(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            fieldPacker.addI64(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            fieldPacker.addF32(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            fieldPacker.addF64(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Byte2) {
            fieldPacker.addI8((Byte2) obj);
            return;
        }
        if (obj instanceof Byte3) {
            fieldPacker.addI8((Byte3) obj);
            return;
        }
        if (obj instanceof Byte4) {
            fieldPacker.addI8((Byte4) obj);
            return;
        }
        if (obj instanceof Short2) {
            fieldPacker.addI16((Short2) obj);
            return;
        }
        if (obj instanceof Short3) {
            fieldPacker.addI16((Short3) obj);
            return;
        }
        if (obj instanceof Short4) {
            fieldPacker.addI16((Short4) obj);
            return;
        }
        if (obj instanceof Int2) {
            fieldPacker.addI32((Int2) obj);
            return;
        }
        if (obj instanceof Int3) {
            fieldPacker.addI32((Int3) obj);
            return;
        }
        if (obj instanceof Int4) {
            fieldPacker.addI32((Int4) obj);
            return;
        }
        if (obj instanceof Long2) {
            fieldPacker.addI64((Long2) obj);
            return;
        }
        if (obj instanceof Long3) {
            fieldPacker.addI64((Long3) obj);
            return;
        }
        if (obj instanceof Long4) {
            fieldPacker.addI64((Long4) obj);
            return;
        }
        if (obj instanceof Float2) {
            fieldPacker.addF32((Float2) obj);
            return;
        }
        if (obj instanceof Float3) {
            fieldPacker.addF32((Float3) obj);
            return;
        }
        if (obj instanceof Float4) {
            fieldPacker.addF32((Float4) obj);
            return;
        }
        if (obj instanceof Double2) {
            fieldPacker.addF64((Double2) obj);
            return;
        }
        if (obj instanceof Double3) {
            fieldPacker.addF64((Double3) obj);
            return;
        }
        if (obj instanceof Double4) {
            fieldPacker.addF64((Double4) obj);
            return;
        }
        if (obj instanceof Matrix2f) {
            fieldPacker.addMatrix((Matrix2f) obj);
            return;
        }
        if (obj instanceof Matrix3f) {
            fieldPacker.addMatrix((Matrix3f) obj);
        } else if (obj instanceof Matrix4f) {
            fieldPacker.addMatrix((Matrix4f) obj);
        } else if (obj instanceof BaseObj) {
            fieldPacker.addObj((BaseObj) obj);
        }
    }

    static FieldPacker createFieldPack(Object[] objArr) {
        int packedSize = 0;
        for (Object obj : objArr) {
            packedSize += getPackedSize(obj);
        }
        FieldPacker fieldPacker = new FieldPacker(packedSize);
        for (Object obj2 : objArr) {
            addToPack(fieldPacker, obj2);
        }
        return fieldPacker;
    }

    static FieldPacker createFromArray(Object[] objArr) {
        FieldPacker fieldPacker = new FieldPacker(RenderScript.sPointerSize * 8);
        for (Object obj : objArr) {
            fieldPacker.addSafely(obj);
        }
        fieldPacker.resize(fieldPacker.mPos);
        return fieldPacker;
    }

    private static int getPackedSize(Object obj) {
        if ((obj instanceof Boolean) || (obj instanceof Byte)) {
            return 1;
        }
        if (obj instanceof Short) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 4;
        }
        if (obj instanceof Long) {
            return 8;
        }
        if (obj instanceof Float) {
            return 4;
        }
        if (obj instanceof Double) {
            return 8;
        }
        if (obj instanceof Byte2) {
            return 2;
        }
        if (obj instanceof Byte3) {
            return 3;
        }
        if ((obj instanceof Byte4) || (obj instanceof Short2)) {
            return 4;
        }
        if (obj instanceof Short3) {
            return 6;
        }
        if ((obj instanceof Short4) || (obj instanceof Int2)) {
            return 8;
        }
        if (obj instanceof Int3) {
            return 12;
        }
        if ((obj instanceof Int4) || (obj instanceof Long2)) {
            return 16;
        }
        if (obj instanceof Long3) {
            return 24;
        }
        if (obj instanceof Long4) {
            return 32;
        }
        if (obj instanceof Float2) {
            return 8;
        }
        if (obj instanceof Float3) {
            return 12;
        }
        if ((obj instanceof Float4) || (obj instanceof Double2)) {
            return 16;
        }
        if (obj instanceof Double3) {
            return 24;
        }
        if (obj instanceof Double4) {
            return 32;
        }
        if (obj instanceof Matrix2f) {
            return 16;
        }
        if (obj instanceof Matrix3f) {
            return 36;
        }
        if (obj instanceof Matrix4f) {
            return 64;
        }
        if (obj instanceof BaseObj) {
            return RenderScript.sPointerSize == 8 ? 32 : 4;
        }
        return 0;
    }

    private boolean resize(int i) {
        if (i == this.mLen) {
            return false;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.mData, 0, bArr, 0, this.mPos);
        this.mData = bArr;
        this.mLen = i;
        return true;
    }

    public void addBoolean(boolean z) {
        addI8(z ? (byte) 1 : (byte) 0);
    }

    public void addF32(float f) {
        addI32(Float.floatToRawIntBits(f));
    }

    public void addF64(double d) {
        addI64(Double.doubleToRawLongBits(d));
    }

    public void addI16(Short2 short2) {
        addI16(short2.f1301x);
        addI16(short2.f1302y);
    }

    public void addI32(int i) {
        align(4);
        byte[] bArr = this.mData;
        int i2 = this.mPos;
        int i3 = i2 + 1;
        this.mPos = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.mPos = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.mPos = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.mPos = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public void addI64(long j) {
        align(8);
        byte[] bArr = this.mData;
        int i = this.mPos;
        int i2 = i + 1;
        this.mPos = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.mPos = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.mPos = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.mPos = i5;
        bArr[i4] = (byte) ((j >> 24) & 255);
        int i6 = i5 + 1;
        this.mPos = i6;
        bArr[i5] = (byte) ((j >> 32) & 255);
        int i7 = i6 + 1;
        this.mPos = i7;
        bArr[i6] = (byte) ((j >> 40) & 255);
        int i8 = i7 + 1;
        this.mPos = i8;
        bArr[i7] = (byte) ((j >> 48) & 255);
        this.mPos = i8 + 1;
        bArr[i8] = (byte) ((j >> 56) & 255);
    }

    public void addI8(byte b) {
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = b;
    }

    public void addMatrix(Matrix2f matrix2f) {
        int i = 0;
        while (true) {
            float[] fArr = matrix2f.mMat;
            if (i >= fArr.length) {
                return;
            }
            addF32(fArr[i]);
            i++;
        }
    }

    public void addObj(BaseObj baseObj) {
        if (baseObj != null) {
            if (RenderScript.sPointerSize != 8) {
                addI32((int) baseObj.getID(null));
                return;
            }
            addI64(baseObj.getID(null));
            addI64(0L);
            addI64(0L);
            addI64(0L);
            return;
        }
        if (RenderScript.sPointerSize != 8) {
            addI32(0);
            return;
        }
        addI64(0L);
        addI64(0L);
        addI64(0L);
        addI64(0L);
    }

    public void addU16(int i) {
        if (i < 0 || i > 65535) {
            Log.e("rs", "FieldPacker.addU16( " + i + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(2);
        byte[] bArr = this.mData;
        int i2 = this.mPos;
        int i3 = i2 + 1;
        this.mPos = i3;
        bArr[i2] = (byte) (i & 255);
        this.mPos = i3 + 1;
        bArr[i3] = (byte) (i >> 8);
    }

    public void addU32(long j) {
        if (j < 0 || j > 4294967295L) {
            Log.e("rs", "FieldPacker.addU32( " + j + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(4);
        byte[] bArr = this.mData;
        int i = this.mPos;
        int i2 = i + 1;
        this.mPos = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.mPos = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.mPos = i4;
        bArr[i3] = (byte) (255 & (j >> 16));
        this.mPos = i4 + 1;
        bArr[i4] = (byte) (j >> 24);
    }

    public void addU64(long j) {
        if (j < 0) {
            Log.e("rs", "FieldPacker.addU64( " + j + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(8);
        byte[] bArr = this.mData;
        int i = this.mPos;
        int i2 = i + 1;
        this.mPos = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.mPos = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.mPos = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.mPos = i5;
        bArr[i4] = (byte) ((j >> 24) & 255);
        int i6 = i5 + 1;
        this.mPos = i6;
        bArr[i5] = (byte) ((j >> 32) & 255);
        int i7 = i6 + 1;
        this.mPos = i7;
        bArr[i6] = (byte) ((j >> 40) & 255);
        int i8 = i7 + 1;
        this.mPos = i8;
        bArr[i7] = (byte) (255 & (j >> 48));
        this.mPos = i8 + 1;
        bArr[i8] = (byte) (j >> 56);
    }

    public void addU8(Short2 short2) {
        addU8(short2.f1301x);
        addU8(short2.f1302y);
    }

    public void align(int i) {
        if (i > 0) {
            int i2 = i - 1;
            if ((i & i2) == 0) {
                while (true) {
                    int i3 = this.mPos;
                    if ((i3 & i2) == 0) {
                        return;
                    }
                    this.mAlignment.flip(i3);
                    byte[] bArr = this.mData;
                    int i4 = this.mPos;
                    this.mPos = i4 + 1;
                    bArr[i4] = 0;
                }
            }
        }
        throw new RSIllegalArgumentException("argument must be a non-negative non-zero power of 2: " + i);
    }

    public final byte[] getData() {
        return this.mData;
    }

    public int getPos() {
        return this.mPos;
    }

    public void reset() {
        this.mPos = 0;
    }

    public void reset(int i) {
        if (i >= 0 && i <= this.mLen) {
            this.mPos = i;
            return;
        }
        throw new RSIllegalArgumentException("out of range argument: " + i);
    }

    public void skip(int i) {
        int i2 = this.mPos + i;
        if (i2 >= 0 && i2 <= this.mLen) {
            this.mPos = i2;
            return;
        }
        throw new RSIllegalArgumentException(NptsKnlVczSZ.DBmjbZFAagzimF + i);
    }

    public boolean subBoolean() {
        return subI8() == 1;
    }

    public Byte2 subByte2() {
        Byte2 byte2 = new Byte2();
        byte2.f1255y = subI8();
        byte2.f1254x = subI8();
        return byte2;
    }

    public Byte3 subByte3() {
        Byte3 byte3 = new Byte3();
        byte3.f1258z = subI8();
        byte3.f1257y = subI8();
        byte3.f1256x = subI8();
        return byte3;
    }

    public Byte4 subByte4() {
        Byte4 byte4 = new Byte4();
        byte4.f1259w = subI8();
        byte4.f1262z = subI8();
        byte4.f1261y = subI8();
        byte4.f1260x = subI8();
        return byte4;
    }

    public Double2 subDouble2() {
        Double2 double2 = new Double2();
        double2.f1264y = subF64();
        double2.f1263x = subF64();
        return double2;
    }

    public Double3 subDouble3() {
        Double3 double3 = new Double3();
        double3.f1267z = subF64();
        double3.f1266y = subF64();
        double3.f1265x = subF64();
        return double3;
    }

    public Double4 subDouble4() {
        Double4 double4 = new Double4();
        double4.f1268w = subF64();
        double4.f1271z = subF64();
        double4.f1270y = subF64();
        double4.f1269x = subF64();
        return double4;
    }

    public float subF32() {
        return Float.intBitsToFloat(subI32());
    }

    public double subF64() {
        return Double.longBitsToDouble(subI64());
    }

    public Float2 subFloat2() {
        Float2 float2 = new Float2();
        float2.f1273y = subF32();
        float2.f1272x = subF32();
        return float2;
    }

    public Float3 subFloat3() {
        Float3 float3 = new Float3();
        float3.f1276z = subF32();
        float3.f1275y = subF32();
        float3.f1274x = subF32();
        return float3;
    }

    public Float4 subFloat4() {
        Float4 float4 = new Float4();
        float4.f1277w = subF32();
        float4.f1280z = subF32();
        float4.f1279y = subF32();
        float4.f1278x = subF32();
        return float4;
    }

    public short subI16() {
        subalign(2);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        int i2 = bArr[i] & 255;
        int i3 = i - 1;
        this.mPos = i3;
        return (short) ((bArr[i3] & 255) | ((short) (i2 << 8)));
    }

    public int subI32() {
        subalign(4);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        int i2 = bArr[i] & 255;
        int i3 = i - 1;
        this.mPos = i3;
        int i4 = bArr[i3] & 255;
        int i5 = i3 - 1;
        this.mPos = i5;
        int i6 = bArr[i5] & 255;
        int i7 = i5 - 1;
        this.mPos = i7;
        return (bArr[i7] & 255) | (i2 << 24) | (i4 << 16) | (i6 << 8);
    }

    public long subI64() {
        subalign(8);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        long j = bArr[i];
        int i2 = i - 1;
        this.mPos = i2;
        long j2 = bArr[i2];
        int i3 = i2 - 1;
        this.mPos = i3;
        long j3 = bArr[i3];
        int i4 = i3 - 1;
        this.mPos = i4;
        long j4 = bArr[i4];
        int i5 = i4 - 1;
        this.mPos = i5;
        long j5 = bArr[i5];
        int i6 = i5 - 1;
        this.mPos = i6;
        long j6 = bArr[i6];
        int i7 = i6 - 1;
        this.mPos = i7;
        long j7 = bArr[i7];
        int i8 = i7 - 1;
        this.mPos = i8;
        return (((long) bArr[i8]) & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public byte subI8() {
        subalign(1);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        return bArr[i];
    }

    public Int2 subInt2() {
        Int2 int2 = new Int2();
        int2.f1282y = subI32();
        int2.f1281x = subI32();
        return int2;
    }

    public Int3 subInt3() {
        Int3 int3 = new Int3();
        int3.f1285z = subI32();
        int3.f1284y = subI32();
        int3.f1283x = subI32();
        return int3;
    }

    public Int4 subInt4() {
        Int4 int4 = new Int4();
        int4.f1286w = subI32();
        int4.f1289z = subI32();
        int4.f1288y = subI32();
        int4.f1287x = subI32();
        return int4;
    }

    public Long2 subLong2() {
        Long2 long2 = new Long2();
        long2.f1291y = subI64();
        long2.f1290x = subI64();
        return long2;
    }

    public Long3 subLong3() {
        Long3 long3 = new Long3();
        long3.f1294z = subI64();
        long3.f1293y = subI64();
        long3.f1292x = subI64();
        return long3;
    }

    public Long4 subLong4() {
        Long4 long4 = new Long4();
        long4.f1295w = subI64();
        long4.f1298z = subI64();
        long4.f1297y = subI64();
        long4.f1296x = subI64();
        return long4;
    }

    public Matrix2f subMatrix2f() {
        Matrix2f matrix2f = new Matrix2f();
        for (int length = matrix2f.mMat.length - 1; length >= 0; length--) {
            matrix2f.mMat[length] = subF32();
        }
        return matrix2f;
    }

    public Matrix3f subMatrix3f() {
        Matrix3f matrix3f = new Matrix3f();
        for (int length = matrix3f.mMat.length - 1; length >= 0; length--) {
            matrix3f.mMat[length] = subF32();
        }
        return matrix3f;
    }

    public Matrix4f subMatrix4f() {
        Matrix4f matrix4f = new Matrix4f();
        for (int length = matrix4f.mMat.length - 1; length >= 0; length--) {
            matrix4f.mMat[length] = subF32();
        }
        return matrix4f;
    }

    public Short2 subShort2() {
        Short2 short2 = new Short2();
        short2.f1302y = subI16();
        short2.f1301x = subI16();
        return short2;
    }

    public Short3 subShort3() {
        Short3 short3 = new Short3();
        short3.f1305z = subI16();
        short3.f1304y = subI16();
        short3.f1303x = subI16();
        return short3;
    }

    public Short4 subShort4() {
        Short4 short4 = new Short4();
        short4.f1306w = subI16();
        short4.f1309z = subI16();
        short4.f1308y = subI16();
        short4.f1307x = subI16();
        return short4;
    }

    public void subalign(int i) {
        int i2;
        int i3 = i - 1;
        if ((i & i3) != 0) {
            throw new RSIllegalArgumentException("argument must be a non-negative non-zero power of 2: " + i);
        }
        while (true) {
            i2 = this.mPos;
            if ((i2 & i3) == 0) {
                break;
            } else {
                this.mPos = i2 - 1;
            }
        }
        if (i2 > 0) {
            while (this.mAlignment.get(this.mPos - 1)) {
                int i4 = this.mPos - 1;
                this.mPos = i4;
                this.mAlignment.flip(i4);
            }
        }
    }

    public void addF32(Float2 float2) {
        addF32(float2.f1272x);
        addF32(float2.f1273y);
    }

    public void addF64(Double2 double2) {
        addF64(double2.f1263x);
        addF64(double2.f1264y);
    }

    public void addI8(Byte2 byte2) {
        addI8(byte2.f1254x);
        addI8(byte2.f1255y);
    }

    public FieldPacker(byte[] bArr) {
        int length = bArr.length;
        this.mPos = length;
        this.mLen = length;
        this.mData = bArr;
        this.mAlignment = new BitSet();
    }

    public void addI16(Short3 short3) {
        addI16(short3.f1303x);
        addI16(short3.f1304y);
        addI16(short3.f1305z);
    }

    public void addMatrix(Matrix3f matrix3f) {
        int i = 0;
        while (true) {
            float[] fArr = matrix3f.mMat;
            if (i >= fArr.length) {
                return;
            }
            addF32(fArr[i]);
            i++;
        }
    }

    public void addU8(Short3 short3) {
        addU8(short3.f1303x);
        addU8(short3.f1304y);
        addU8(short3.f1305z);
    }

    public void addF32(Float3 float3) {
        addF32(float3.f1274x);
        addF32(float3.f1275y);
        addF32(float3.f1276z);
    }

    public void addF64(Double3 double3) {
        addF64(double3.f1265x);
        addF64(double3.f1266y);
        addF64(double3.f1267z);
    }

    public void addI8(Byte3 byte3) {
        addI8(byte3.f1256x);
        addI8(byte3.f1257y);
        addI8(byte3.f1258z);
    }

    public void addMatrix(Matrix4f matrix4f) {
        int i = 0;
        while (true) {
            float[] fArr = matrix4f.mMat;
            if (i >= fArr.length) {
                return;
            }
            addF32(fArr[i]);
            i++;
        }
    }

    public void addI16(Short4 short4) {
        addI16(short4.f1307x);
        addI16(short4.f1308y);
        addI16(short4.f1309z);
        addI16(short4.f1306w);
    }

    public void addI32(Int2 int2) {
        addI32(int2.f1281x);
        addI32(int2.f1282y);
    }

    public void addU16(Int2 int2) {
        addU16(int2.f1281x);
        addU16(int2.f1282y);
    }

    public void addU8(Short4 short4) {
        addU8(short4.f1307x);
        addU8(short4.f1308y);
        addU8(short4.f1309z);
        addU8(short4.f1306w);
    }

    public void addF32(Float4 float4) {
        addF32(float4.f1278x);
        addF32(float4.f1279y);
        addF32(float4.f1280z);
        addF32(float4.f1277w);
    }

    public void addF64(Double4 double4) {
        addF64(double4.f1269x);
        addF64(double4.f1270y);
        addF64(double4.f1271z);
        addF64(double4.f1268w);
    }

    public void addI8(Byte4 byte4) {
        addI8(byte4.f1260x);
        addI8(byte4.f1261y);
        addI8(byte4.f1262z);
        addI8(byte4.f1259w);
    }

    public void addI32(Int3 int3) {
        addI32(int3.f1283x);
        addI32(int3.f1284y);
        addI32(int3.f1285z);
    }

    public void addU16(Int3 int3) {
        addU16(int3.f1283x);
        addU16(int3.f1284y);
        addU16(int3.f1285z);
    }

    public void addU32(Long2 long2) {
        addU32(long2.f1290x);
        addU32(long2.f1291y);
    }

    public void addI16(short s) {
        align(2);
        byte[] bArr = this.mData;
        int i = this.mPos;
        int i2 = i + 1;
        this.mPos = i2;
        bArr[i] = (byte) (s & 255);
        this.mPos = i2 + 1;
        bArr[i2] = (byte) (s >> 8);
    }

    public void addI64(Long2 long2) {
        addI64(long2.f1290x);
        addI64(long2.f1291y);
    }

    public void addU32(Long3 long3) {
        addU32(long3.f1292x);
        addU32(long3.f1293y);
        addU32(long3.f1294z);
    }

    public void addU8(short s) {
        if (s < 0 || s > 255) {
            Log.e("rs", "FieldPacker.addU8( " + ((int) s) + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) s;
    }

    public void addI32(Int4 int4) {
        addI32(int4.f1287x);
        addI32(int4.f1288y);
        addI32(int4.f1289z);
        addI32(int4.f1286w);
    }

    public void addU16(Int4 int4) {
        addU16(int4.f1287x);
        addU16(int4.f1288y);
        addU16(int4.f1289z);
        addU16(int4.f1286w);
    }

    public void addI64(Long3 long3) {
        addI64(long3.f1292x);
        addI64(long3.f1293y);
        addI64(long3.f1294z);
    }

    public void addU64(Long2 long2) {
        addU64(long2.f1290x);
        addU64(long2.f1291y);
    }

    public void addU32(Long4 long4) {
        addU32(long4.f1296x);
        addU32(long4.f1297y);
        addU32(long4.f1298z);
        addU32(long4.f1295w);
    }

    public void addU64(Long3 long3) {
        addU64(long3.f1292x);
        addU64(long3.f1293y);
        addU64(long3.f1294z);
    }

    public void addI64(Long4 long4) {
        addI64(long4.f1296x);
        addI64(long4.f1297y);
        addI64(long4.f1298z);
        addI64(long4.f1295w);
    }

    public void addU64(Long4 long4) {
        addU64(long4.f1296x);
        addU64(long4.f1297y);
        addU64(long4.f1298z);
        addU64(long4.f1295w);
    }
}
