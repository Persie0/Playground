package p253m1;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import dm.C5207g;

/* JADX INFO: renamed from: m1.q */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class C7470q extends Canvas {

    /* JADX INFO: renamed from: a */
    public Canvas f41319a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        C5207g.m11111f(path, "path");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f3, float f10, float f11, float f12) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipOutRect(f3, f10, f11, f12);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipOutRect(i10, i11, i12, i13);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        C5207g.m11111f(rect, "rect");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        C5207g.m11111f(rectF, "rect");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipOutRect(rectF);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        C5207g.m11111f(path, "path");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        C5207g.m11111f(path, "path");
        C5207g.m11111f(op, "op");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f10, float f11, float f12) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipRect(f3, f10, f11, f12);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f10, float f11, float f12, Region.Op op) {
        C5207g.m11111f(op, "op");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipRect(f3, f10, f11, f12, op);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipRect(i10, i11, i12, i13);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        C5207g.m11111f(rect, "rect");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        C5207g.m11111f(rect, "rect");
        C5207g.m11111f(op, "op");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        C5207g.m11111f(rectF, "rect");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        C5207g.m11111f(rectF, "rect");
        C5207g.m11111f(op, "op");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawARGB(i10, i11, i12, i13);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f3, float f10, float f11, float f12, float f13, float f14, boolean z10, Paint paint) {
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawArc(f3, f10, f11, f12, f13, f14, z10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f3, float f10, boolean z10, Paint paint) {
        C5207g.m11111f(rectF, "oval");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawArc(rectF, f3, f10, z10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f3, float f10, Paint paint) {
        C5207g.m11111f(bitmap, "bitmap");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f3, f10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        C5207g.m11111f(bitmap, "bitmap");
        C5207g.m11111f(matrix, "matrix");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        C5207g.m11111f(bitmap, "bitmap");
        C5207g.m11111f(rect2, "dst");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        C5207g.m11111f(bitmap, "bitmap");
        C5207g.m11111f(rectF, "dst");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, float f3, float f10, int i12, int i13, boolean z10, Paint paint) {
        C5207g.m11111f(iArr, "colors");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, f3, f10, i12, i13, z10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        C5207g.m11111f(iArr, "colors");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        C5207g.m11111f(bitmap, "bitmap");
        C5207g.m11111f(fArr, "verts");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawCircle(float f3, float f10, float f11, Paint paint) {
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawCircle(f3, f10, f11, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawColor(int i10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawColor(i10);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawColor(int i10, BlendMode blendMode) {
        C5207g.m11111f(blendMode, "mode");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawColor(i10, blendMode);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        C5207g.m11111f(mode, "mode");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawColor(i10, mode);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawColor(j10);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawColor(long j10, BlendMode blendMode) {
        C5207g.m11111f(blendMode, "mode");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawColor(j10, blendMode);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f3, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        C5207g.m11111f(rectF, "outer");
        C5207g.m11111f(rectF2, "inner");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f3, f10, rectF2, f11, f12, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        C5207g.m11111f(rectF, "outer");
        C5207g.m11111f(fArr, "outerRadii");
        C5207g.m11111f(rectF2, "inner");
        C5207g.m11111f(fArr2, "innerRadii");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        C5207g.m11111f(iArr, "glyphIds");
        C5207g.m11111f(fArr, "positions");
        C5207g.m11111f(font, "font");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f3, float f10, float f11, float f12, Paint paint) {
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawLine(f3, f10, f11, f12, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        C5207g.m11111f(fArr, "pts");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawLines(fArr, i10, i11, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        C5207g.m11111f(fArr, "pts");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawOval(float f3, float f10, float f11, float f12, Paint paint) {
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawOval(f3, f10, f11, f12, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        C5207g.m11111f(rectF, "oval");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        C5207g.m11111f(ninePatch, "patch");
        C5207g.m11111f(rect, "dst");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        C5207g.m11111f(ninePatch, "patch");
        C5207g.m11111f(rectF, "dst");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        C5207g.m11111f(path, "path");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        C5207g.m11111f(picture, "picture");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        C5207g.m11111f(picture, "picture");
        C5207g.m11111f(rect, "dst");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        C5207g.m11111f(picture, "picture");
        C5207g.m11111f(rectF, "dst");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPoint(float f3, float f10, Paint paint) {
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPoint(f3, f10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i10, i11, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        C5207g.m11111f(fArr, "pts");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(fArr, "pos");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        C5207g.m11111f(cArr, "text");
        C5207g.m11111f(fArr, "pos");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i10, i11, fArr, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawRGB(i10, i11, i12);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f3, float f10, float f11, float f12, Paint paint) {
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawRect(f3, f10, f11, f12, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        C5207g.m11111f(rect, "r");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        C5207g.m11111f(rectF, "rect");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        C5207g.m11111f(renderNode, "renderNode");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f3, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawRoundRect(f3, f10, f11, f12, f13, f14, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f3, float f10, Paint paint) {
        C5207g.m11111f(rectF, "rect");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f3, f10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i10, int i11, float f3, float f10, Paint paint) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawText(charSequence, i10, i11, f3, f10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f3, float f10, Paint paint) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawText(str, f3, f10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawText(String str, int i10, int i11, float f3, float f10, Paint paint) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawText(str, i10, i11, f3, f10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i10, int i11, float f3, float f10, Paint paint) {
        C5207g.m11111f(cArr, "text");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawText(cArr, i10, i11, f3, f10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f3, float f10, Paint paint) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(path, "path");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f3, f10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f3, float f10, Paint paint) {
        C5207g.m11111f(cArr, "text");
        C5207g.m11111f(path, "path");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i10, i11, path, f3, f10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f3, float f10, boolean z10, Paint paint) {
        C5207g.m11111f(measuredText, "text");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i10, i11, i12, i13, f3, f10, z10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f3, float f10, boolean z10, Paint paint) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i10, i11, i12, i13, f3, f10, z10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f3, float f10, boolean z10, Paint paint) {
        C5207g.m11111f(cArr, "text");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i10, i11, i12, i13, f3, f10, z10, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        C5207g.m11111f(vertexMode, "mode");
        C5207g.m11111f(fArr, "verts");
        C5207g.m11111f(paint, "paint");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        C5207g.m11111f(rect, "bounds");
        Canvas canvas = this.f41319a;
        if (canvas == null) {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        C5207g.m11111f(matrix, "ctm");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f10, float f11, float f12) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.quickReject(f3, f10, f11, f12);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        C5207g.m11111f(edgeType, "type");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.quickReject(f3, f10, f11, f12, edgeType);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        C5207g.m11111f(path, "path");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.quickReject(path);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        C5207g.m11111f(path, "path");
        C5207g.m11111f(edgeType, "type");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        C5207g.m11111f(rectF, "rect");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.quickReject(rectF);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        C5207g.m11111f(rectF, "rect");
        C5207g.m11111f(edgeType, "type");
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.restore();
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void restoreToCount(int i10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.restoreToCount(i10);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f3) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.rotate(f3);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.save();
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f10, f11, f12, paint);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f10, float f11, float f12, Paint paint, int i10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f10, f11, f12, paint, i10);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i10);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f10, float f11, float f12, int i10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f10, f11, f12, i10);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f10, float f11, float f12, int i10, int i11) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f10, f11, f12, i10, i11);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10, i11);
        }
        C5207g.m11117l("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f3, float f10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.scale(f3, f10);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.graphics.Canvas
    public final void setDensity(int i10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.setDensity(i10);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f3, float f10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.skew(f3, f10);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f3, float f10) {
        Canvas canvas = this.f41319a;
        if (canvas != null) {
            canvas.translate(f3, f10);
        } else {
            C5207g.m11117l("nativeCanvas");
            throw null;
        }
    }
}
