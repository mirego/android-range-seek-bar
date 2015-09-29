package org.florescu.android.rangeseekbar;

import java.io.Serializable;

/**
 * Utility class to modify the displayed value in the labels.
 */
public class RangeSeekBarValueProcessor implements Serializable {
    protected String getProcessedValue(Number value) {
        return String.valueOf(value);
    }
}
