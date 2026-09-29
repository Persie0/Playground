package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class er2 extends b34 {

    /* JADX INFO: renamed from: A */
    public boolean f37741A = true;

    /* JADX INFO: renamed from: y */
    public final TextView f37742y;

    /* JADX INFO: renamed from: z */
    public final yq2 f37743z;

    public er2(TextView textView) {
        this.f37742y = textView;
        this.f37743z = new yq2(textView);
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: P */
    public final void mo3259P(boolean z) {
        if (z) {
            TextView textView = this.f37742y;
            textView.setTransformationMethod(mo3261d0(textView.getTransformationMethod()));
        }
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: R */
    public final void mo3260R(boolean z) {
        this.f37741A = z;
        TextView textView = this.f37742y;
        textView.setTransformationMethod(mo3261d0(textView.getTransformationMethod()));
        textView.setFilters(mo3262n(textView.getFilters()));
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: d0 */
    public final TransformationMethod mo3261d0(TransformationMethod transformationMethod) {
        if (this.f37741A) {
            return ((transformationMethod instanceof ir2) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new ir2(transformationMethod);
        }
        return transformationMethod instanceof ir2 ? ((ir2) transformationMethod).f44453a : transformationMethod;
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: n */
    public final InputFilter[] mo3262n(InputFilter[] inputFilterArr) {
        if (!this.f37741A) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof yq2) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            yq2 yq2Var = this.f37743z;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = yq2Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == yq2Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: u */
    public final boolean mo3263u() {
        return this.f37741A;
    }
}
