package p269n3;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C0892f;

/* JADX INFO: renamed from: n3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7701f {

    /* JADX INFO: renamed from: a */
    public final b f42219a;

    /* JADX INFO: renamed from: n3.f$a */
    public static class a extends b {

        /* JADX INFO: renamed from: a */
        public final TextView f42220a;

        /* JADX INFO: renamed from: b */
        public final C7699d f42221b;

        /* JADX INFO: renamed from: c */
        public boolean f42222c = true;

        public a(TextView textView) {
            this.f42220a = textView;
            this.f42221b = new C7699d(textView);
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: a */
        public final InputFilter[] mo15292a(InputFilter[] inputFilterArr) {
            if (!this.f42222c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof C7699d) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i13 = 0;
            while (true) {
                C7699d c7699d = this.f42221b;
                if (i13 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = c7699d;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i13] == c7699d) {
                    return inputFilterArr;
                }
                i13++;
            }
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: b */
        public final boolean mo15293b() {
            return this.f42222c;
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: c */
        public final void mo15294c(boolean z10) {
            if (z10) {
                TextView textView = this.f42220a;
                textView.setTransformationMethod(mo15296e(textView.getTransformationMethod()));
            }
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: d */
        public final void mo15295d(boolean z10) {
            this.f42222c = z10;
            TextView textView = this.f42220a;
            textView.setTransformationMethod(mo15296e(textView.getTransformationMethod()));
            textView.setFilters(mo15292a(textView.getFilters()));
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: e */
        public final TransformationMethod mo15296e(TransformationMethod transformationMethod) {
            if (!this.f42222c) {
                if (transformationMethod instanceof C7703h) {
                    transformationMethod = ((C7703h) transformationMethod).f42229a;
                }
                return transformationMethod;
            }
            if (!(transformationMethod instanceof C7703h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new C7703h(transformationMethod);
            }
            return transformationMethod;
        }
    }

    /* JADX INFO: renamed from: n3.f$b */
    public static class b {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo15292a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo15293b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo15294c(boolean z10) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo15295d(boolean z10) {
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: e */
        public TransformationMethod mo15296e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: n3.f$c */
    public static class c extends b {

        /* JADX INFO: renamed from: a */
        public final a f42223a;

        public c(TextView textView) {
            this.f42223a = new a(textView);
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: a */
        public final InputFilter[] mo15292a(InputFilter[] inputFilterArr) {
            return C0892f.m3520c() ^ true ? inputFilterArr : this.f42223a.mo15292a(inputFilterArr);
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: b */
        public final boolean mo15293b() {
            return this.f42223a.f42222c;
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: c */
        public final void mo15294c(boolean z10) {
            if (!C0892f.m3520c()) {
                return;
            }
            this.f42223a.mo15294c(z10);
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: d */
        public final void mo15295d(boolean z10) {
            boolean z11 = !C0892f.m3520c();
            a aVar = this.f42223a;
            if (z11) {
                aVar.f42222c = z10;
            } else {
                aVar.mo15295d(z10);
            }
        }

        @Override // p269n3.C7701f.b
        /* JADX INFO: renamed from: e */
        public final TransformationMethod mo15296e(TransformationMethod transformationMethod) {
            return C0892f.m3520c() ^ true ? transformationMethod : this.f42223a.mo15296e(transformationMethod);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7701f(TextView textView) {
        if (textView == null) {
            throw new NullPointerException("textView cannot be null");
        }
        this.f42219a = new c(textView);
    }
}
