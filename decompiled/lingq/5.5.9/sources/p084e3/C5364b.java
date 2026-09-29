package p084e3;

import android.graphics.Rect;
import java.util.Comparator;
import p497y2.C10284f;

/* JADX INFO: renamed from: e3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5364b {

    /* JADX INFO: renamed from: e3.b$a */
    public interface a<T> {
    }

    /* JADX INFO: renamed from: e3.b$b */
    public static class b<T> implements Comparator<T> {

        /* JADX INFO: renamed from: a */
        public final Rect f33704a = new Rect();

        /* JADX INFO: renamed from: b */
        public final Rect f33705b = new Rect();

        /* JADX INFO: renamed from: c */
        public final boolean f33706c;

        /* JADX INFO: renamed from: d */
        public final a<T> f33707d;

        public b(boolean z10, AbstractC5363a.a aVar) {
            this.f33706c = z10;
            this.f33707d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            AbstractC5363a.a aVar = (AbstractC5363a.a) this.f33707d;
            aVar.getClass();
            Rect rect = this.f33704a;
            ((C10284f) t10).m19259d(rect);
            aVar.getClass();
            Rect rect2 = this.f33705b;
            ((C10284f) t11).m19259d(rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            boolean z10 = this.f33706c;
            if (i12 < i13) {
                return z10 ? 1 : -1;
            }
            if (i12 > i13) {
                return z10 ? -1 : 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                return z10 ? 1 : -1;
            }
            if (i16 > i17) {
                return z10 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m11516a(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean z10;
        int i11;
        int i12;
        boolean zM11517b = m11517b(i10, rect, rect2);
        if (m11517b(i10, rect, rect3) || !zM11517b) {
            return false;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (rect.right <= rect3.left) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (rect.top >= rect3.bottom) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (rect.left >= rect3.right) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && i10 != 17 && i10 != 66) {
            int iM11519d = m11519d(i10, rect, rect2);
            if (i10 == 17) {
                i11 = rect.left;
                i12 = rect3.left;
            } else if (i10 == 33) {
                i11 = rect.top;
                i12 = rect3.top;
            } else if (i10 == 66) {
                i11 = rect3.right;
                i12 = rect.right;
            } else {
                if (i10 != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i11 = rect3.bottom;
                i12 = rect.bottom;
            }
            return iM11519d < Math.max(1, i11 - i12);
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m11517b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m11518c(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if (i13 > i14 || rect.top >= i14) {
                if (rect.top > rect2.top) {
                    return true;
                }
            }
            return false;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            if (i15 < i16 || rect.right <= i16) {
                if (rect.right < rect2.right) {
                    return true;
                }
            }
            return false;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if (i17 < i18 || rect.bottom <= i18) {
            if (rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static int m11519d(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    /* JADX INFO: renamed from: e */
    public static int m11520e(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
